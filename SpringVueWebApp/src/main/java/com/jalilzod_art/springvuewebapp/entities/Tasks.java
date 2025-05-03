package com.jalilzod_art.springvuewebapp.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  long id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status = Status.NEW;
}
