package dev.alisherdev08.librarymanagement.service;

import dev.alisherdev08.librarymanagement.entity.Student;
import dev.alisherdev08.librarymanagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
       private final StudentRepository studentRepository;

       @Transactional
       public Student createStudent(Student student){
           return studentRepository.save(student);
       }
       @Transactional(readOnly = true)
       public Student findStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
       }
       @Transactional(readOnly = true)
       public List<Student> findAllStudents(){
           return studentRepository.findAll();
       }
       @Transactional
       public Student updateStudentById(Long id, Student request) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found."));
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setPhone(request.getPhone());
        student.setStatus(request.getStatus());
        student.setStudentNumber(request.getStudentNumber());
        student.setEnrollmentDate(request.getEnrollmentDate());
        return studentRepository.save(student);
       }
       @Transactional
       public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
       }





}
