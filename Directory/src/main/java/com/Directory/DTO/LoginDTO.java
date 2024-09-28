package com.Directory.DTO;

import org.springframework.stereotype.Repository;

import com.Directory.model.User;

@Repository
public interface LoginDTO {


	User findByEmail(String username);

	
}
