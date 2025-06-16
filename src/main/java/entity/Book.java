package entity;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Getter
@Setter

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDate publicationDate;

    public Book() {}

    public Book(String isbn, String title, LocalDate publicationDate) {
        this.isbn = isbn;
        this.title = title;
        this.publicationDate = publicationDate;
        this.author = null;
    }

}
