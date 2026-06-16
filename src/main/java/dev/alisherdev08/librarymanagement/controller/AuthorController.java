package dev.alisherdev08.librarymanagement.controller;

import dev.alisherdev08.librarymanagement.entity.Author;
import dev.alisherdev08.librarymanagement.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @PostMapping
    public Author createAuthor(@RequestBody Author author){
         return  authorService.createAuthor(author);
    }
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id){
        return authorService.findAuthorById(id);
    }
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.findAllAuthors();
    }
    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author){
        return authorService.updateAuthor(id, author);
    }
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorService.deleteAuthor(id);
    }
}
