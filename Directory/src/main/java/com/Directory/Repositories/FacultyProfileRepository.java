package com.Directory.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Directory.model.FacultyProfile;

@Repository
public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {
    List<FacultyProfile> findByDepartment(String department);
}
