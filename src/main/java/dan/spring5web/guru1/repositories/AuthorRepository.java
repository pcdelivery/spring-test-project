package dan.spring5web.guru1.repositories;

import dan.spring5web.guru1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
