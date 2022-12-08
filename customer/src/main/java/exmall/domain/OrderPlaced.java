package exmall.domain;

import exmall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodid;
    private List<String> options;
    private String address;
    private String customerid;
    private Integer qty;
    private String orderId;
    private String status;
}
