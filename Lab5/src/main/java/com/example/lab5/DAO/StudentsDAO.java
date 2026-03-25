package com.example.lab5.DAO;

import com.example.lab5.entities.J6Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsDAO extends JpaRepository<J6Student, String> {

}
