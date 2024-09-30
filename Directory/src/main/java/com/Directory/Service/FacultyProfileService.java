package com.Directory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Directory.Repositories.FacultyProfileRepository;
import com.Directory.model.FacultyProfile;

@Service
public class FacultyProfileService {

    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    @Transactional
    public List<FacultyProfile> getAdvisorsByDepartment(String department) {
        return facultyProfileRepository.findByDepartment(department);
    }
}
