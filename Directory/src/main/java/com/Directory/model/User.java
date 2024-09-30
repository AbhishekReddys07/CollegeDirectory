package com.Directory.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

    @Column(name = "username", nullable = false)
     String username;

    @Column(name = "password", nullable = false)
     String password;

    @Column(name = "role", nullable = false)
     String role;

    @Column(name = "email", nullable = false)
    String email;
    // Getters and setters

    public  void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", getId()="
				+ getId() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getRole()="
				+ getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getEmail() {
		
		return "bishek1234@gmail.com";
	}
}
