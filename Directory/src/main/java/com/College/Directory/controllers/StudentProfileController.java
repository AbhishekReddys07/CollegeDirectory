package com.College.Directory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Directory.Service.StudentProfileService;
import com.Directory.model.StudentProfile;

@RestController
@RequestMapping("/api/students")
public class StudentProfileController {

    @Autowired
    private StudentProfileService studentProfileService;

    @GetMapping("/search")
    public List<StudentProfile> searchStudents(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String department,
            @RequestParam(required = false, defaultValue = "0") int year) {

        // Return filtered list of students
        return studentProfileService.searchStudents(name, department, year);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentProfile> getStudentById(@PathVariable Long id) {
        StudentProfile studentProfile = studentProfileService.getStudentById(id);
        if (studentProfile != null) {
            return ResponseEntity.ok(studentProfile);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
