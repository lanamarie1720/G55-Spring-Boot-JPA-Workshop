package repository;

import entity.Book;
import entity.BookLoan;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository {
    List<Book> findByAuthor_LastName(String lastName);
    List<Book> findByTitle(String title);
    List<Book> findByPublicationDateBefore(LocalDate date);
    List<Book> findByPublicationDateAfter(LocalDate date);
    Book findByIsbn(String isbn);
}
