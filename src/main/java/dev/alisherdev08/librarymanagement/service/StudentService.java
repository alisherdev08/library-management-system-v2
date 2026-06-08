package dev.alisherdev08.librarymanagement.service;

import dev.alisherdev08.librarymanagement.entity.Student;
import dev.alisherdev08.librarymanagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
       private final StudentRepository studentRepository;

       public Student createStudent(Student student){
           return studentRepository.save(student);
       }
       public Student findStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
       }
       public List<Student> findAllStudents(){
           return studentRepository.findAll();
       }
       public Student updateStudentById(Long id, Student request) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found."));
        student.setFisrtName(request.getFisrtName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setPhone(request.getPhone());
        student.setStatus(request.getStatus());
        student.setStudentNumber(request.getStudentNumber());
        student.setEnrollmentDate(request.getEnrollmentDate());
        return studentRepository.save(student);
       }
       public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
       }





}
