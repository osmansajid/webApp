package sajid.springframework.webApp.repository;

import org.springframework.data.repository.CrudRepository;
import sajid.springframework.webApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
