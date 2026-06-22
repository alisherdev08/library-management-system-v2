package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.book.BookCreateDTO;
import dev.alisherdev08.librarymanagement.dto.book.BookResponseDTO;
import dev.alisherdev08.librarymanagement.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toEntity(BookCreateDTO dto);
    BookResponseDTO toDto(Book book);
}
