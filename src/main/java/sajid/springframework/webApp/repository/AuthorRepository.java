package sajid.springframework.webApp.repository;

import org.springframework.data.repository.CrudRepository;
import sajid.springframework.webApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
