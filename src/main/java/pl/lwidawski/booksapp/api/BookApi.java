package pl.lwidawski.booksapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lwidawski.booksapp.dao.enitity.Book;
import pl.lwidawski.booksapp.manager.BookManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/books")
public class BookApi {

    private BookManager books;

    @Autowired
    public BookApi(BookManager books) {
        this.books = books;
    }

    /* --Replaced by dataBase
    private List<Book> books;

    public BookApi(){
        books = new ArrayList<>();
        books.add(new Book(1L, "Book1", LocalDate.of(1995,2,3)));
        books.add(new Book(2L, "Book2", LocalDate.of(1991,1,2)));

    }*/

    @GetMapping("/all")
    public Iterable<Book> getAll(){
        return books.findAll();
    }

    @GetMapping
    public Optional<Book> getById(@RequestParam Long index){
        /*--Lambda replaced by using BookManager
        Optional<Book> first = books.stream().filter(element -> element.getId() == index).findFirst();*/
        return books.findById(index);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return books.save(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {

        return books.save(book);
    }

    @DeleteMapping
    public void deleteBook(@RequestParam Long index){
        /*return books.removeIf(element -> element.getId() == index);*/
        books.deleteById(index);
    }

}
