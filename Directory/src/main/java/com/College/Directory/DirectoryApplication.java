package com.College.Directory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = { "com.College.Directory.controllers", "com.Directory.model",
		"com.Directory.Service", "com.Directory.DTO" })
@EntityScan(basePackages = "com.Directory.model")
public class DirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectoryApplication.class, args);
	}

}
