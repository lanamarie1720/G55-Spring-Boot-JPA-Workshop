package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "book_loan")
@Getter
@Setter

public class BookLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(nullable = false)
    private LocalDate borrowDate;

    @Column(nullable = false)
    private LocalDate dueDate;
    private final boolean aBoolean;

    @Column(nullable = false)
    private boolean returned;

    public BookLoan(AppUser user, Book book, LocalDate borrowDate, LocalDate dueDate, boolean aBoolean){
        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.aBoolean = true;
        this.returned = false;
    }
}
