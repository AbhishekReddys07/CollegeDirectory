package com.College.Directory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Directory.Service.LoginService;
import com.Directory.model.User;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService; // Assume you have a service to handle user logic

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Return the view name for your login page (login.html in /templates)
    }

    @GetMapping("/student")
    public String studentPage() {
        return "student"; // Return the view name for student (student.html in /templates)
    }

    @PostMapping("/login-form")
    public ModelAndView login(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              @RequestParam("role") String role) {
        
        ModelAndView mav = new ModelAndView();

        try {
            // Validate user credentials
            User userDetails = loginService.validateUser(username, password); // Validate user with your service

            // If authentication is successful and role matches
            if (userDetails != null && userDetails.getRole().equals(role)) {
                switch (role) {
                    case "STUDENT":
                        mav.setViewName("student"); // Forward to student.html
                        break;
                    case "FACULTY":
                        mav.setViewName("Faculty"); // Forward to faculty.html
                        break;
                    case "ADMIN":
                        mav.setViewName("Admin"); // Forward to admin.html
                        break;
                    default:
                        mav.setViewName("login"); // Default to login.html
                        mav.addObject("error", "Invalid role.");
                        break;
                }
            } else {
                mav.setViewName("login");
                mav.addObject("error", "Invalid username, password, or role.");
            }

        } catch (Exception e) {
            mav.setViewName("login");
            mav.addObject("error", "An error occurred during login: " + e.getMessage());
        }

        return mav;
    }
}
