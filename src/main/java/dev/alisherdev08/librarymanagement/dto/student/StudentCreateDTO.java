package dev.alisherdev08.librarymanagement.dto.student;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class StudentCreateDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String studentNumber;
    private LocalDate enrollmentDate;
}
