package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.student.StudentCreateDTO;
import dev.alisherdev08.librarymanagement.dto.student.StudentResponseDTO;
import dev.alisherdev08.librarymanagement.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student toEntity(StudentCreateDTO dto);
    StudentResponseDTO toDto(Student student);
}
