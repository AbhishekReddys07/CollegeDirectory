package com.Directory.Service;

import java.util.List;

import com.Directory.model.User;

public interface SignupService {

	 void createUser(User user);
	    User getUserById(Long id);
	    List<User> getAllUsers();
	    User updateUser(Long id, User user);
	    void deleteUser(Long id);
}
