package dev.alisherdev08.librarymanagement.service;

import dev.alisherdev08.librarymanagement.entity.Author;
import dev.alisherdev08.librarymanagement.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    public Author createAuthor(Author author){
       return authorRepository.save(author);
    }
    public Author findAuthorById(Long id){
        return authorRepository.findById(id).orElse(null);
    }
    public List<Author> findAllAuthors(){
        return authorRepository.findAll();
    }
    public Author updateAuthor(Long id, Author request){
        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found."));
        author.setFirstName(request.getFirstName());
        author.setLastName(request.getLastName());
        author.setEmail(request.getEmail());
        author.setBirthDate(request.getBirthDate());
        return authorRepository.save(author);
    }
    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }
}
