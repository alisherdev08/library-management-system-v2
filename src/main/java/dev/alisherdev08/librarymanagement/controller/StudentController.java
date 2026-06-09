package dev.alisherdev08.librarymanagement.controller;

import dev.alisherdev08.librarymanagement.entity.Student;
import dev.alisherdev08.librarymanagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return  studentService.findStudentById(id);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.findAllStudents();
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudentById(id, student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }
}
