package dev.alisherdev08.librarymanagement.service;

import dev.alisherdev08.librarymanagement.entity.Author;
import dev.alisherdev08.librarymanagement.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Transactional
    public Author createAuthor(Author author){
       return authorRepository.save(author);
    }
    @Transactional(readOnly = true)
    public Author findAuthorById(Long id){
        return authorRepository.findById(id).orElse(null);
    }
    @Transactional(readOnly = true)
    public List<Author> findAllAuthors(){
        return authorRepository.findAll();
    }
    @Transactional
    public Author updateAuthor(Long id, Author request){
        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found."));
        author.setFirstName(request.getFirstName());
        author.setLastName(request.getLastName());
        author.setEmail(request.getEmail());
        author.setBirthDate(request.getBirthDate());
        return authorRepository.save(author);
    }
    @Transactional
    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }
}
