package com.Directory.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_profiles")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "year")
    private int year;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FacultyProfile advisor; // Many students can have one advisor

    // Getters and Setters
}
