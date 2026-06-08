package dev.alisherdev08.librarymanagement.repository;

import dev.alisherdev08.librarymanagement.entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Long> {
}
