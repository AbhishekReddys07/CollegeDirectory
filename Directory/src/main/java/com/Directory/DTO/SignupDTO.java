package com.Directory.DTO;

import java.util.List;

import com.Directory.model.User;

public interface SignupDTO {

	 void createUser(User user);
	    User getUserById(Long id);
	    List<User> getAllUsers();
	    User updateUser(Long id, User user);
	    void deleteUser(Long id);
	
}
