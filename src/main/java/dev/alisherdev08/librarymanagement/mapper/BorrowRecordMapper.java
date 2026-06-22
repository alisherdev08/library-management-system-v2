package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.borrow_record.BorrowRecordCreateDTO;
import dev.alisherdev08.librarymanagement.dto.borrow_record.BorrowRecordResponseDTO;
import dev.alisherdev08.librarymanagement.entity.BorrowRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BorrowRecordMapper {
    BorrowRecord toEntity(BorrowRecordCreateDTO dto);
    BorrowRecordResponseDTO toDto(BorrowRecord borrowRecord);
}
