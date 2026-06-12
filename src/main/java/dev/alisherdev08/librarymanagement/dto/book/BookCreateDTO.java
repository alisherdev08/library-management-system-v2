package dev.alisherdev08.librarymanagement.dto.book;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookCreateDTO {
    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private Integer publishedYear;
}
