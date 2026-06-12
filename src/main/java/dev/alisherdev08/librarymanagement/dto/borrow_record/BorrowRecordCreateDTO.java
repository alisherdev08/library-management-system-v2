package dev.alisherdev08.librarymanagement.dto.borrow_record;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BorrowRecordCreateDTO {
    private  Long bookId;
    private Long studentId;
}
