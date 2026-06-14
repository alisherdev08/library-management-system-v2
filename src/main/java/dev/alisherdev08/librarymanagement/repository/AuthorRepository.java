package dev.alisherdev08.librarymanagement.repository;

import dev.alisherdev08.librarymanagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
