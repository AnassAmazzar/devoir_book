package ma.emsi.devoir_surveille_book.service;


import ma.emsi.devoir_surveille_book.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> getBookByTitle(String title);

    BookDTO saveBook(BookDTO bookDTO);
}

