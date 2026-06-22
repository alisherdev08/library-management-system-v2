package dev.alisherdev08.librarymanagement.mapper;

import dev.alisherdev08.librarymanagement.dto.author.AuthorCreateDTO;
import dev.alisherdev08.librarymanagement.dto.author.AuthorResponseDTO;
import dev.alisherdev08.librarymanagement.entity.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author toEntity(AuthorCreateDTO dto);
    AuthorResponseDTO toDto(Author author);
}
