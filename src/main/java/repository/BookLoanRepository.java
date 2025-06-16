package repository;

import entity.BookLoan;

import java.time.LocalDate;
import java.util.List;

public interface BookLoanRepository {
    List<BookLoan> findByUserId(Long userId);
    List<BookLoan> findByBookId(Long bookId);
    List<BookLoan> findByReturnedFalse();
    List<BookLoan> fineByDueDateBeforeAndReturnedFalse(LocalDate date);
    List<BookLoan> findByBorrowDateBetween(LocalDate startDate, LocalDate endDate);
}
