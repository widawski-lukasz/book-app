package pl.lwidawski.booksapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lwidawski.booksapp.dao.BookRepo;
import pl.lwidawski.booksapp.dao.enitity.Book;

import java.util.Optional;

@Service
public class BookManager {

    private BookRepo bookRepo;

    @Autowired
    public BookManager(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    public Optional<Book> findById(Long id){
        return bookRepo.findById(id);

    }
}
