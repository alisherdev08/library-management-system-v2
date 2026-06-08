package dev.alisherdev08.librarymanagement.repository;

import dev.alisherdev08.librarymanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
