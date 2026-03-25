package com.example.lab5.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "J6Students")
public class J6Student {
    @Id
    @Column(name = "Id", nullable = false, length = 50)
    private String id;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "Mark", nullable = false)
    private Double mark;

    @Column(name = "Gender", nullable = false)
    private Boolean gender;


}