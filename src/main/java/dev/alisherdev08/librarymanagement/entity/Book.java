package dev.alisherdev08.librarymanagement.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "books")
public class Book {
    @ColumnDefault("now()")
    @Column(name = "updated_at")
    private Instant updatedAt;
    @ColumnDefault("now()")
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "published_year", nullable = false)
    private Integer publishedYear;
    @Column(name = "publisher", length = Integer.MAX_VALUE)
    private String publisher;
    @Column(name = "author", length = Integer.MAX_VALUE)
    private String author;
    @Column(name = "isbn", length = 13)
    private String isbn;
    @Column(name = "title", nullable = false, length = Integer.MAX_VALUE)
    private String title;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }
}
