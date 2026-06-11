package dev.alisherdev08.librarymanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
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

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BorrowRecord> borrowRecords = new HashSet<>();
}
