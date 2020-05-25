package pl.lwidawski.booksapp;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/books")
public class BookApi {

    private List<Book> books;

    public BookApi(){
        books = new ArrayList<>();
        books.add(new Book(1L, "Book1", LocalDate.of(1995,2,3)));
        books.add(new Book(2L, "Book2", LocalDate.of(1991,1,2)));

    }

    @GetMapping("/all")
    public List<Book> getAll(){
        return books;
    }

    @GetMapping
    public Book getById(@RequestParam int index){
        Optional<Book> first = books.stream().filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addBook(@RequestBody Book book) {
        return books.add(book);
    }

    @PutMapping
    public boolean updateBook(@RequestBody Book book) {
        return books.add(book);
    }

    @DeleteMapping
    public boolean deleteBook(@RequestParam int index){
        return books.removeIf(element -> element.getId() == index);
    }

}
