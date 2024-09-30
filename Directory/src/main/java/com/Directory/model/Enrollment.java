//package com.Directory.model;
//
//import java.util.List;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "enrollments")
// class Enrollment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "course_id")
//    private Course course;
//
//    @ManyToOne
//    @JoinColumn(name = "student_profile_id")
//    private StudentProfile studentProfile;
//
//    // Additional fields like enrollmentDate
//}
//
//@Entity
//@Table(name = "student_profiles")
//  class Student_profiel extends User {
//    @OneToMany(mappedBy = "studentProfile")
//    private List<Enrollment> enrollments;
//
//    @ManyToMany
//    @JoinTable(
//        name = "student_courses",
//        joinColumns = @JoinColumn(name = "student_profile_id"),
//        inverseJoinColumns = @JoinColumn(name = "course_id")
//    )
//    private List<Course> courses;
//
//    // Student-specific fields
//}
