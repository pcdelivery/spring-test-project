package dan.spring5web.guru1.repositories;

import dan.spring5web.guru1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
