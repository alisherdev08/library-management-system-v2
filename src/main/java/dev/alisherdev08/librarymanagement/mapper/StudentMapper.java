package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.student.StudentCreateDTO;
import dev.alisherdev08.librarymanagement.dto.student.StudentResponseDTO;
import dev.alisherdev08.librarymanagement.entity.Student;
import java.util.HashSet;

public interface StudentMapper {
    default Student toEntity(StudentCreateDTO dto) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setBorrowRecords(new HashSet<>());
        return student;
    }
    default StudentResponseDTO toResponseDTO(Student student) {
        StudentResponseDTO dto = new StudentResponseDTO();
        dto.setId(student.getId());
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        return dto;
    }
}
