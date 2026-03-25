package com.example.lab5.impl;

import com.example.lab5.DAO.StudentsDAO;
import com.example.lab5.entities.J6Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lab5.service.StudentSevice;

import java.util.List;

@Service
public class StudentSeviceImpl implements StudentSevice {
    @Autowired
    StudentsDAO studentsDAO;

    @Override
    public List<J6Student> getAllStudents() {
        return studentsDAO.findAll();
    }

    @Override
    public J6Student getStudentById(String id) {
        return studentsDAO.findById(id).orElse(null);
    }

    @Override
    public J6Student createStudent(J6Student j6Student) {
        return studentsDAO.save(j6Student);
    }

    @Override
    public J6Student updateStudent(J6Student j6Student) {
        return studentsDAO.save(j6Student);
    }

    @Override
    public void deleteStudentById(String id) {
        studentsDAO.deleteById(id);
    }

}
