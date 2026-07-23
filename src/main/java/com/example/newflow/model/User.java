package com.example.newflow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    private Long id;
private String firstName;
private String lastName;
private String email;
private  String password;
private String role;

    @CreationTimestamp
    private LocalDateTime createdAt;

}


