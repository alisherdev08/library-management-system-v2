package dev.alisherdev08.librarymanagement.dto.book;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class BookResponseDTO {
    private Long id;
    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private Integer publishedYear;
    private Instant createdAt;
    private Instant updatedAt;
}
