//package com.College.Directory.controllers;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/login", "/signUp", "/login-from", "/welcompage", "/signup").permitAll() // Allow access to these paths
//                .requestMatchers("/student").hasRole("STUDENT")
//                .requestMatchers("/faculty_dashboard").hasRole("FACULTY_MEMBER")
//                .requestMatchers("/admin_dashboard").hasRole("ADMINISTRATOR")
//                .anyRequest().authenticated() // All other requests require authentication
//            )
//            .formLogin(form -> form
//                .loginPage("/login")
//                .loginProcessingUrl("/login") // Specify the custom login processing URL
//                .permitAll() // Allow everyone to see the login page
//            ) .formLogin(form -> form
//                    .loginPage("/welcompage")
//                    .loginProcessingUrl("/welcompage") // Specify the custom login processing URL
//                    .permitAll() // Allow everyone to see the login page
//                )
//            .logout(logout -> logout
//                .permitAll() // Allow everyone to log out
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//            )
//            .csrf(csrf -> csrf.disable()); // Disable CSRF for testing (enable it if needed)
//
//        return http.build();
//    }
//
//    @Bean
//    AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
//        AuthenticationManagerBuilder authenticationManagerBuilder = 
//            http.getSharedObject(AuthenticationManagerBuilder.class);
//        // You can set your authentication provider here
//        return authenticationManagerBuilder.build();
//    }
//
//    @Bean
//    ViewResolver viewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/jsp/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//}
