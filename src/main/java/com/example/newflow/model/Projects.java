package com.example.newflow.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Projects {
   @Id
   private Long id;
   private String name;
   private String description;
   private String status;
    @CreationTimestamp
    private LocalDateTime start_date;
    @CreationTimestamp
    private LocalDateTime due_date;
    @CreationTimestamp
    private LocalDateTime created_by;
    @CreationTimestamp
    private LocalDateTime created_at;
   @ManyToOne
    @JoinColumn(name = "workspace_id", nullable = false)
    private  workSpace workspace;

}
