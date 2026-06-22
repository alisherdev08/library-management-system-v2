package dev.alisherdev08.librarymanagement.service;

import dev.alisherdev08.librarymanagement.entity.Book;
import dev.alisherdev08.librarymanagement.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Book createBook(Book book){
        return bookRepository.save(book);
    }
    @Transactional(readOnly = true)
    public Book findBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }
    @Transactional(readOnly = true)
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
    @Transactional
    public Book updateBookById(Long id, Book request){
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found."));
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setPublisher(request.getPublisher());
        book.setIsbn(request.getIsbn());
        book.setPublishedYear(request.getPublishedYear());
        return bookRepository.save(book);
    }
    @Transactional
    public void deleteBookById(Long id){
         bookRepository.deleteById(id);
    }
}
