package com.example.newflow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class workSpace {

        @Id
        private Long id;
        private String name;
        private Long ownerId;
        private String description;
        @CreationTimestamp
        private LocalDateTime createdAt;

    }


