package dan.spring5web.guru1.controllers;

import dan.spring5web.guru1.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(path = "/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
