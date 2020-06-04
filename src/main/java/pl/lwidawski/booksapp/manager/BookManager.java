package pl.lwidawski.booksapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.lwidawski.booksapp.dao.BookRepo;
import pl.lwidawski.booksapp.dao.enitity.Book;

import java.time.LocalDate;
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

    public Iterable<Book> findAll() {
        return bookRepo.findAll();
    }

    public Book save(Book book){
        return bookRepo.save(book);
    }

    public void deleteById(Long id){
        bookRepo.deleteById(id);;
    }

    @EventListener(ApplicationReadyEvent.class) //do when app run
    public void fillDB(){
        save (new Book(1L, "Book1", LocalDate.of(1995,2,3)));
        save (new Book(2L, "Book2", LocalDate.of(1991,1,2)));
    }
}
