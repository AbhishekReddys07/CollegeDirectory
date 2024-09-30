package com.College.Directory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Directory.Service.FacultyProfileService;
import com.Directory.model.FacultyProfile;

@RestController
@RequestMapping("/api/faculty")
public class FacultyProfileController {

    @Autowired
    private FacultyProfileService facultyProfileService;

    @GetMapping("/advisors")
    public List<FacultyProfile> getAdvisorsByDepartment(@RequestParam(required = false) String department) {
        // Fetch advisors by department
        return facultyProfileService.getAdvisorsByDepartment(department);
    }
}
