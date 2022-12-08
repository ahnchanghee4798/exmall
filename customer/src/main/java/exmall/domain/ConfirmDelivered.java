package exmall.domain;

import exmall.domain.*;
import exmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ConfirmDelivered extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String address;
}


