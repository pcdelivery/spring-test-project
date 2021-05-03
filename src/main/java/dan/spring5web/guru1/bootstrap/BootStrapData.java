package dan.spring5web.guru1.bootstrap;

import dan.spring5web.guru1.domain.Author;
import dan.spring5web.guru1.domain.Book;
import dan.spring5web.guru1.domain.Publisher;
import dan.spring5web.guru1.repositories.AuthorRepository;
import dan.spring5web.guru1.repositories.BookRepository;
import dan.spring5web.guru1.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author = new Author("Name", "Second name");
        Book book = new Book("BOOK NAME", "ISBN example");
        Publisher publisher = new Publisher(
                "Publisher name",
                "Moscow, Russia",
                "Moscow",
                "Moscow state",
                "112000"
        );

        publisherRepository.save(publisher);
        bookRepository.save(book);
        authorRepository.save(author);

        book.setPublisher(publisher);
        author.getBooks().add(book);
        book.getAuthors().add(author);
        publisher.getBooks().add(book);

        publisherRepository.save(publisher);
        bookRepository.save(book);
        authorRepository.save(author);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());
    }
}
