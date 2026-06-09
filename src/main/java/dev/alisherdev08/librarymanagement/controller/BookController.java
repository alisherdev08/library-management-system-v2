package dev.alisherdev08.librarymanagement.controller;

import dev.alisherdev08.librarymanagement.entity.Book;
import dev.alisherdev08.librarymanagement.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.findBookById(id);
    }
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.findAllBooks();
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBookById(id, book);
    }
    @DeleteMapping("{/id}")
    public void deleteBook(@PathVariable Long id){
         bookService.deleteBookById(id);
    }
}
