package pl.lwidawski.booksapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lwidawski.booksapp.dao.enitity.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
}
