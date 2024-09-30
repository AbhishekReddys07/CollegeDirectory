package com.College.Directory.controllers;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class CustomSecurityConfig { // Renamed the class

	@SuppressWarnings({ "removal", "deprecation" })
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
				.requestMatchers("/login-form", "/", "/login", "/signup", "/signUp", "/welcome").permitAll()
				.requestMatchers("/STUDENT").hasRole("STUDENT").requestMatchers("/FACULTY").hasRole("FACULTY_MEMBER")
				.requestMatchers("/faculty").hasRole("FACULTY_MEMBER") // Allow only faculty members
				.anyRequest().authenticated().and().formLogin(form -> form.loginPage("/login") // Specify your custom
																								// login page URL
						.loginProcessingUrl("/login") // Form action to submit the login request
						.defaultSuccessUrl("/login-form", true) // Redirect to welcome after successful login
						.permitAll() // Allow anyone to access the login page
				)
				// Logout configuration
				.logout(logout -> logout.logoutUrl("/logout").logoutSuccessUrl("/login?logout") // Redirect to login
																								// page after logout
						.invalidateHttpSession(true).permitAll());
		return http.build();

	}
}
