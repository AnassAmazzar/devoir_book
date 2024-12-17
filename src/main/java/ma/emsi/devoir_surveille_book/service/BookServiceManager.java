package ma.emsi.devoir_surveille_book.service;

import ma.emsi.devoir_surveille_book.dao.entities.Book;
import ma.emsi.devoir_surveille_book.dao.repository.BookRepository;
import ma.emsi.devoir_surveille_book.dto.BookDTO;
import ma.emsi.devoir_surveille_book.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceManager implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    private List<BookDTO> bookDTOList = new ArrayList<>();

    @Override
    public List<BookDTO> getBookByTitle(String title) {
        if(title!=null){
            for (Book book: bookRepository.findByTitre(title)){
                bookDTOList.add(bookMapper.fromBooktoBookDTO(book));
            }
        }
        return bookDTOList;
    }

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        BookDTO bookDTO1=null;
        if(bookDTO!=null){
            bookDTO1=bookMapper.fromBooktoBookDTO(bookRepository.save(bookMapper.fromBookDTOtoBook(bookDTO)));
        }
        return bookDTO1;
    }
}
