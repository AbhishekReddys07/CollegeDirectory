package com.College.Directory.controllers;

import com.Directory.Service.SignupService;
import com.Directory.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignUpController {

    @Autowired
    private SignupService signupService;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp"; // Returns the sign-up page
    }

    @PostMapping("/signup")
    public ModelAndView postSignUp(HttpServletRequest request) {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        System.out.println(fullName + " " + email + " " + role);

        // Create a new User object
        User newUser = new User();
        newUser.setUsername(email); // Assuming the email serves as the username
        newUser.setPassword(password); // You might want to hash this password before saving
        newUser.setRole(role);

        // Save the user to the database
        signupService.createUser(newUser);

        // Redirect to the login page after successful signup
        return new ModelAndView("redirect:/login");
    }
}
