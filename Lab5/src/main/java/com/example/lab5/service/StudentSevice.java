package com.example.lab5.service;

import com.example.lab5.entities.J6Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentSevice {
    List<J6Student> getAllStudents();
    J6Student getStudentById(String id);
    J6Student createStudent(J6Student j6Student);
    J6Student updateStudent(J6Student j6Student);
    void deleteStudentById(String id);
}
