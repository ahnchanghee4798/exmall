package exmall.domain;

import exmall.domain.*;
import exmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private Object options;
    private Integer qty;
    private String storeId;
    private String customerId;
}


