package dev.alisherdev08.librarymanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "students")
public class Student {
    @ColumnDefault("'active'")
    @Column(name = "status", length = 20)
    private String status;
    @Column(name = "student_number", nullable = false, length = 50)
    private String studentNumber;
    @Column(name = "enrollment_date", nullable = false)
    private LocalDate enrollmentDate;
    @Column(name = "phone", length = 20)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BorrowRecord> borrowRecords = new HashSet<>();
}
