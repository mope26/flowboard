package com.example.newflow.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Tasks {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "project_id",nullable = false)
    private Projects projects;
    private String title;
    private String description;
    private String status;
    private String priority;
    @CreationTimestamp
    private LocalDateTime created_by;
    @CreationTimestamp
    private LocalDateTime due_date ;
    @CreationTimestamp
    private LocalDateTime created_at;

    @CreationTimestamp
    private LocalDateTime updated_at;
}




