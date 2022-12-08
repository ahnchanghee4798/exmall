package exmall.infra;
import exmall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DeliveryHateoasProcessor implements RepresentationModelProcessor<EntityModel<Delivery>>  {

    @Override
    public EntityModel<Delivery> process(EntityModel<Delivery> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/pick").withRel("pick"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/delivery").withRel("delivery"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/confirmdelivery").withRel("confirmdelivery"));

        
        return model;
    }
    
}
