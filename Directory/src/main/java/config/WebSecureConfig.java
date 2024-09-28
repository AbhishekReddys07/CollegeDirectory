//package config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.web.servlet.ViewResolver;
//
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecureConfig {
//
//	@Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//       http
//           .authorizeHttpRequests(auth -> auth
//               .requestMatchers("/login", "/signUp", "/login-from", "/welcompage","/signup","/student").permitAll() // Allow access to these paths
//               .requestMatchers("/student").hasRole("STUDENT")
//               .requestMatchers("/faculty_dashboard").hasRole("FACULTY_MEMBER")
//               .requestMatchers("/admin_dashboard").hasRole("ADMINISTRATOR")
//               .anyRequest().authenticated() // All other requests require authentication
//           )
//           .formLogin(form -> form
//               .loginPage("/login")
//               .loginProcessingUrl("/login") // Specify the custom login page
//               .permitAll() // Allow everyone to see the login page
//           )
//           .formLogin(form -> form
//                   .loginPage("/signup")
//                   .loginProcessingUrl("/signup") // Specify the custom login page
//                   .permitAll() // Allow everyone to see the login page
//               )
//           
//           .logout(logout -> logout
//               .permitAll() // Allow everyone to log out
//               .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//           )
//           
//           .csrf(csrf -> csrf.disable()); // Disable CSRF for testing (enable it if needed)
//
//       return http.build();
//   }
//
//   @Bean
//    ViewResolver viewResolver() {
//       InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//       resolver.setPrefix("/WEB-INF/jsp/");
//       resolver.setSuffix(".jsp");
//       return resolver;
//   }
//}
