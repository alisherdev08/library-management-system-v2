package dev.alisherdev08.librarymanagement.service;

import dev.alisherdev08.librarymanagement.entity.BorrowRecord;
import dev.alisherdev08.librarymanagement.repository.BorrowRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BorrowRecordService {
       private final BorrowRecordRepository borrowRecordRepository;

       @Transactional
        public BorrowRecord createBorrow(BorrowRecord borrowRecord){
        borrowRecord.setStatus("borrowed");
        borrowRecord.setBorrowDate(LocalDate.now());
        return borrowRecordRepository.save(borrowRecord);
        }
        @Transactional(readOnly = true)
        public BorrowRecord findBorrowRecordById(Long id){
        return borrowRecordRepository.findById(id).orElse(null);
        }
        @Transactional(readOnly = true)
        public List<BorrowRecord> findAllBorrowRecords(){
            return borrowRecordRepository.findAll();
        }
        @Transactional
        public BorrowRecord updateBorrowRecordById(Long id, BorrowRecord request){
            BorrowRecord record = borrowRecordRepository.findById(id).orElseThrow(() -> new RuntimeException("Borrow Record not found."));
            record.setReturnDate(request.getReturnDate());
            record.setStatus(request.getStatus());
            return borrowRecordRepository.save(record);
        }
        @Transactional
        public void deleteBorrowRecordById(Long id){
             borrowRecordRepository.deleteById(id);
        }
}
