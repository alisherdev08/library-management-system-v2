package dev.alisherdev08.librarymanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "borrow_records")
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long bookId;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private java.time.LocalDate borrowDate;
    @Column
    private java.time.LocalDate returnDate;
    @Column(nullable = false)
    private String status;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getBookId() { return bookId; }
    public void setBookId(Long bookId) { this.bookId = bookId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public java.time.LocalDate getBorrowDate() { return borrowDate; }
    public void setBorrowDate(java.time.LocalDate borrowDate) { this.borrowDate = borrowDate; }

    public java.time.LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(java.time.LocalDate returnDate) { this.returnDate = returnDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }


}
