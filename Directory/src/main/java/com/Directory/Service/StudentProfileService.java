package com.Directory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Directory.Repositories.StudentProfileRepository;
import com.Directory.model.StudentProfile;

@Service
public class StudentProfileService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public List<StudentProfile> searchStudents(String name, String department, int year) {
        // Use custom query to filter students
        return studentProfileRepository.findByNameContainingAndDepartmentContainingAndYear(name, department, year);
    }

    public StudentProfile getStudentById(Long id) {
        return studentProfileRepository.findById(id).orElse(null);
    }
}
