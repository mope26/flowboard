package com.example.newflow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
public class workSpace_members {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @ManyToOne
        @JoinColumn(name = "workspace_id",nullable = false)
        private workSpace workspace;
        @ManyToOne
        @JoinColumn(name = "user_id",nullable = false)
        private  User user;
        private  String role;
        @CreationTimestamp
        private LocalDateTime joinedAt;
    }


