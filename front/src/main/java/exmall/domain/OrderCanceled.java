package exmall.domain;

import exmall.domain.*;
import exmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String foodid;
    private List<String> options;
    private String address;
    private String customerid;
    private Integer qty;
    private String orderId;
    private String status;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
