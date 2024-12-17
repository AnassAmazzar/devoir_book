package ma.emsi.devoir_surveille_book.web;


import ma.emsi.devoir_surveille_book.dto.BookDTO;
import ma.emsi.devoir_surveille_book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
public class BookGraphQLController {

    @Autowired
    private BookService bookService;


    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book){
        return bookService.saveBook(book);
    }

    @QueryMapping
    public List<BookDTO> getBookByTitle(@Argument String title){
        return bookService.getBookByTitle(title);
    }

}
