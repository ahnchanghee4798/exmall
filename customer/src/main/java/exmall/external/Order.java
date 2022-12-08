package exmall.external;

import lombok.Data;
import java.util.Date;
@Data
public class Order {

    private Long id;
    private String foodid;
    private Object options;
    private String address;
    private String customerid;
    private Integer qty;
    private String orderId;
    private String status;
}


