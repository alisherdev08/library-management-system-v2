package dev.alisherdev08.librarymanagement.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

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
    @Column(name = "fisrt_name", nullable = false, length = 100)
    private String fisrtName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public Long getId() {
        return id;
    }
}
