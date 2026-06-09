package dev.alisherdev08.librarymanagement.controller;

import dev.alisherdev08.librarymanagement.entity.BorrowRecord;
import dev.alisherdev08.librarymanagement.service.BorrowRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrow_records")
@RequiredArgsConstructor
public class BorrowRecordController {
    private final BorrowRecordService borrowRecordService;

    @PostMapping
    public BorrowRecord createRecord(@RequestBody BorrowRecord borrowRecord){
        return borrowRecordService.createBorrow(borrowRecord);
    }
    @GetMapping("/{id}")
    public BorrowRecord getRecord(@PathVariable Long id){
        return borrowRecordService.findBorrowRecordById(id);
    }
    @GetMapping
    public List<BorrowRecord> getAllRecords(){
        return borrowRecordService.findAllBorrowRecords();
    }
    @PutMapping("/{id}")
    public BorrowRecord updateRecord(@PathVariable Long id, @RequestBody BorrowRecord borrowRecord){
        return borrowRecordService.updateBorrowRecordById(id, borrowRecord);
    }
    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id){
         borrowRecordService.deleteBorrowRecordById(id);
    }
}
