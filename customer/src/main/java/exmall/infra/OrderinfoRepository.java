package exmall.infra;

import exmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="orderinfos", path="orderinfos")
public interface OrderinfoRepository extends PagingAndSortingRepository<Orderinfo, Long> {

    

    
}
