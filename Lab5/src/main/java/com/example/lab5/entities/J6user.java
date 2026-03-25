package com.example.lab5.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "J6users")
public class J6user {
    @Id
    @Column(name = "Username", nullable = false, length = 50)
    private String username;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Enabled", nullable = false)
    private Boolean enabled;

    @OneToMany(mappedBy = "username")
    private Set<J6userrole> j6userroles = new LinkedHashSet<>();


}