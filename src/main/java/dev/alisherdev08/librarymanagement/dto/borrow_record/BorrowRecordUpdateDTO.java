package dev.alisherdev08.librarymanagement.dto.borrow_record;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class BorrowRecordUpdateDTO {
    private String status;
    private LocalDate returnDate;
}
