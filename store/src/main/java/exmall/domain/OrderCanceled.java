package exmall.domain;

import exmall.domain.*;
import exmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String foodid;
    private Object options;
    private String address;
    private String customerid;
    private Integer qty;
    private String orderId;
    private String status;
}


