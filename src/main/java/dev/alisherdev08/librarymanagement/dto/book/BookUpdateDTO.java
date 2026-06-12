package dev.alisherdev08.librarymanagement.dto.book;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookUpdateDTO {
    private String title;
    private String author;
    private String publisher;
    private Integer publishedYear;
}
