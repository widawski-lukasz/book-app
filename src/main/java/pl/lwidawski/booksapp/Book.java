package pl.lwidawski.booksapp;

import java.time.LocalDate;

public class Book {

    private Long id;
    private String title;
    private LocalDate publicationYear;

    public Book() {
    }

    public Book(Long id, String title, LocalDate publicationYear) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }
}
