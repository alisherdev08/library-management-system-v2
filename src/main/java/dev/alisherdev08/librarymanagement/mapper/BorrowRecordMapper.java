package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.borrow_record.BorrowRecordCreateDTO;
import dev.alisherdev08.librarymanagement.dto.borrow_record.BorrowRecordResponseDTO;
import dev.alisherdev08.librarymanagement.entity.BorrowRecord;

public interface BorrowRecordMapper {
    default BorrowRecord toEntity(BorrowRecordCreateDTO dto){
        BorrowRecord borrowRecord = new BorrowRecord();
        borrowRecord.setStudentId(dto.getStudentId());
        borrowRecord.setBookId(dto.getBookId());
        return borrowRecord;
    }
    default BorrowRecordResponseDTO toDTO(BorrowRecord borrowRecord){
        BorrowRecordResponseDTO dto = new BorrowRecordResponseDTO();
        dto.setId(borrowRecord.getId());
        dto.setStudentId(borrowRecord.getStudentId());
        dto.setBookId(borrowRecord.getBookId());
        dto.setBorrowDate(borrowRecord.getBorrowDate());
        dto.setReturnDate(borrowRecord.getReturnDate());
        return dto;
    }
}
