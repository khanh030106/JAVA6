package com.example.lab5.controller;

import com.example.lab5.entities.J6Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.lab5.service.StudentSevice;

import java.util.List;

@CrossOrigin("*")
@RestController
public class StudentRestApi {
    @Autowired
    StudentSevice studentSevice;

    @GetMapping("/students")
    public List<J6Student> findAllStudents() {
        return studentSevice.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public J6Student findStudentById(@PathVariable("id") String id) {
        return studentSevice.getStudentById(id);
    }

    @PostMapping("/students")
    public J6Student create(@RequestBody J6Student j6Student) {
        return studentSevice.createStudent(j6Student);
    }

    @PutMapping("/students/{id}")
    public J6Student update(@PathVariable("id") String id, @RequestBody J6Student j6Student) {
        j6Student.setId(id);
        return studentSevice.updateStudent(j6Student);
    }

    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable("id") String id) {
        studentSevice.deleteStudentById(id);
    }
}
