package com.Directory.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Directory.model.StudentProfile;

@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
	// Custom search query
	List<StudentProfile> findByNameContainingAndDepartmentContainingAndYear(String name, String department, int year);
}
