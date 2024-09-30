package com.College.Directory.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.Directory.Service.LoginService;
import com.Directory.model.User;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    
    @GetMapping("/student")
    public String studentDashboard() {
        return "student"; // Make sure you have a student.html in your templates directory
    }

    @GetMapping("/faculty")
    public String facultyDashboard() {
        return "Faculty"; // Make sure you have Faculty.html in your templates directory
    }

    @GetMapping("/admin")
    public String adminDashboard() {
        return "Admin"; // Make sure you have Admin.html in your templates directory
    }

    @GetMapping("/login")
    public String loginpage() {
    	return "login";
    }

    @PostMapping("/login-form")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        @RequestParam("role") String role) {

        try {
            // Retrieve user by email
            User userDetails = loginService.findByEmail(email);

            // Validate user details (check if user exists, password matches, and role matches)
            if (userDetails != null && userDetails.getPassword().equals(password) 
                && userDetails.getRole().equalsIgnoreCase(role)) {

                // Redirect based on role
                switch (role.toUpperCase()) {
                    case "STUDENT":
                        return "redirect:/student";
                        
                    case "FACULTY_MEMBER":
                        return "redirect:/Faculty";
                        
                    case "ADMINISTRATOR":
                        return "redirect:/Admin";
                        
                    default:
                        return "redirect:/Admin"; // If role does not match
                }
            } else {
                // If invalid credentials, redirect to login
                return "redirect:/login";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login"; // Handle any unexpected exceptions by redirecting to login
        }
    }


}
