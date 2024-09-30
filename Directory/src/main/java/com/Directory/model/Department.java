//package com.Directory.model;
//
//import java.util.List;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "departments")
//public class Department {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	private String departmentName;
//
//	@OneToMany(mappedBy = "department")
//	private List<Enrollment> students;
//
//	@OneToMany(mappedBy = "department")
//	private List<FacultyProfile> faculty;
//
//	@OneToMany(mappedBy = "department")
//	private List<AdministratorProfile> administrators;
//
//	@OneToMany(mappedBy = "department")
//	private List<Course> courses;
//
//	// Getters and Setters
//}
//
//@Entity
//@Table(name = "student_profiles")
// class StudentProfile extends User {
//	@ManyToOne
//	@JoinColumn(name = "department_id")
//	private Department department;
//
//	// Existing fields and relations
//}
//
//@Entity
//@Table(name = "faculty_profiles")
// class FacultyProfile extends User {
//	@ManyToOne
//	@JoinColumn(name = "department_id")
//	private Department department;
//
//	// Existing fields and relations
//}
//
//@Entity
//@Table(name = "administrator_profiles")
// class AdministratorProfile extends User{
//	@ManyToOne
//	@JoinColumn(name = "department_id")
//	private Department department;
//
//	// Existing fields and relations
//}
//
//@Entity
//@Table(name = "courses")
// class Course {
//	@ManyToOne
//	@JoinColumn(name = "department_id")
//	private Department department;
//
//	// Existing fields and relations
//}
