package com.College.Directory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = { "com.College.Directory.controllers", "com.Directory.model",
		"com.Directory.Service", "com.Directory.DTO" ,"com.Directory.Repositories"})
@EntityScan(basePackages = "com.Directory.model")
@EnableJpaRepositories(basePackages = "com.Directory.Repositories")
public class DirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectoryApplication.class, args);
	}

}
