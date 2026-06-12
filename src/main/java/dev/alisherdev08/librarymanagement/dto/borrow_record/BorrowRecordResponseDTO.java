package dev.alisherdev08.librarymanagement.dto.borrow_record;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class BorrowRecordResponseDTO {
    private Long id;
    private Long bookId;
    private Long studentId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String status;
}
