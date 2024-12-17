package ma.emsi.devoir_surveille_book.dao.repository;

import ma.emsi.devoir_surveille_book.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByTitre(String title);
}
