package exmall.domain;

import exmall.domain.TankytextTransed;
import exmall.TankyoutextApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Tankytext_table")
@Data

public class Tankytext  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String tankyou;
    
    
    
    
    
    private String customerid;

    @PostPersist
    public void onPostPersist(){


        TankytextTransed tankytextTransed = new TankytextTransed(this);
        tankytextTransed.publishAfterCommit();

    }

    public static TankytextRepository repository(){
        TankytextRepository tankytextRepository = TankyoutextApplication.applicationContext.getBean(TankytextRepository.class);
        return tankytextRepository;
    }




    public static void tankyToCustomer(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        Tankytext tankytext = new Tankytext();
        repository().save(tankytext);

        TankytextTransed tankytextTransed = new TankytextTransed(tankytext);
        tankytextTransed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(tankytext->{
            
            tankytext // do something
            repository().save(tankytext);

            TankytextTransed tankytextTransed = new TankytextTransed(tankytext);
            tankytextTransed.publishAfterCommit();

         });
        */

        
    }


}
