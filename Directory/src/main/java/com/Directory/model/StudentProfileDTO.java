package com.Directory.model;

public class StudentProfileDTO {
    private Long id;
    private String name;
    private String department;
    private int year;
    private String email;
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getDepartment() {
		return department;
	}
	public final void setDepartment(String department) {
		this.department = department;
	}
	public final int getYear() {
		return year;
	}
	public final void setYear(int year) {
		this.year = year;
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}

    // Getters and Setters
    
}
