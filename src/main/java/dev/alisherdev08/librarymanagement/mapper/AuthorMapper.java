package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.author.AuthorCreateDTO;
import dev.alisherdev08.librarymanagement.dto.author.AuthorResponseDTO;
import dev.alisherdev08.librarymanagement.entity.Author;

public interface AuthorMapper {
    default Author toEntity(AuthorCreateDTO dto){
        Author author = new Author();
        author.setFirstName(dto.getFirstName());
        author.setLastName(dto.getLastName());
        author.setEmail(dto.getEmail());
        author.setBirthDate(dto.getBirthDate());
        return author;
    }
    default AuthorResponseDTO toDTO(Author author){
        AuthorResponseDTO dto = new AuthorResponseDTO();
        dto.setFirstName(author.getFirstName());
        dto.setLastName(author.getLastName());
        dto.setEmail(author.getEmail());
        dto.setBirthDate(author.getBirthDate());
        return dto;
    }
}
