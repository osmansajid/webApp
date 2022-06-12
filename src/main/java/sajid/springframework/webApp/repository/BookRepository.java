package sajid.springframework.webApp.repository;

import org.springframework.data.repository.CrudRepository;
import sajid.springframework.webApp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
