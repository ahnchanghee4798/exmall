package exmall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Orderinfo_table")
@Data
public class Orderinfo {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String status;


}
