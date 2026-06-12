package dev.alisherdev08.librarymanagement.dto.student;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentUpdateDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String status;
}
