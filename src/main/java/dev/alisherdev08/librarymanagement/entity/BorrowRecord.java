package dev.alisherdev08.librarymanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
}
