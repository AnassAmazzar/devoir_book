package ma.emsi.devoir_surveille_book.mapper;

import ma.emsi.devoir_surveille_book.dao.entities.Book;
import ma.emsi.devoir_surveille_book.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class BookMapper {

    ModelMapper model = new ModelMapper();

    //fromBooktoBookDTO
    public BookDTO fromBooktoBookDTO(Book book){
        return model.map(book, BookDTO.class);
    }

    //fromBookDTOtoBook
    public Book fromBookDTOtoBook(BookDTO bookDTO){
        return model.map(bookDTO, Book.class);
    }
}
