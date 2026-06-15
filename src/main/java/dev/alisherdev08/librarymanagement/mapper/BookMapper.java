package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.book.BookCreateDTO;
import dev.alisherdev08.librarymanagement.dto.book.BookResponseDTO;
import dev.alisherdev08.librarymanagement.entity.Book;

public interface BookMapper {
    default Book toEntity(BookCreateDTO dto){
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setIsbn(dto.getIsbn());
        book.setPublisher(dto.getPublisher());
        return book;
    }
    default BookResponseDTO toDTO(Book book){
        BookResponseDTO dto = new BookResponseDTO();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setIsbn(book.getIsbn());
        dto.setPublisher(book.getPublisher());
        dto.setPublishedYear(book.getPublishedYear());
        return dto;
    }
}
