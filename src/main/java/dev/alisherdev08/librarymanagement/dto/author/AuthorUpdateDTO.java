package dev.alisherdev08.librarymanagement.dto.author;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class AuthorUpdateDTO {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
}
