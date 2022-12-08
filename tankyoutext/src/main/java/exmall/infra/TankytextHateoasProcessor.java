package exmall.infra;
import exmall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class TankytextHateoasProcessor implements RepresentationModelProcessor<EntityModel<Tankytext>>  {

    @Override
    public EntityModel<Tankytext> process(EntityModel<Tankytext> model) {

        
        return model;
    }
    
}
