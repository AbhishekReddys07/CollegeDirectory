package com.Directory.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Directory.DTO.LoginDTO;
import com.Directory.model.User;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired
	private LoginDTO login;
	
	@Override
	@Transactional
	public User findByEmail(String username) {
		return login.findByEmail(username);
		
		
	}

	@Override

	public User validateUser(String username, String password) {
		 User user = login.findByEmail(username); // Retrieve user by email
	        if (user != null && user.getPassword().equals(password)) { // Validate password
	        	System.out.println(username+password);
	            return user; // Return user details if valid
	        }
	        return null;
	}

	@Override
	@Transactional
	public User getUserByEmail(String email) {
	
		return null;
	}

}
