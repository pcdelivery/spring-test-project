package dan.spring5web.guru1.repositories;

import dan.spring5web.guru1.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
