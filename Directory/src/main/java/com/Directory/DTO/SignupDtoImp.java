package com.Directory.DTO;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Directory.model.User;


import jakarta.persistence.EntityManager;

@Repository
public class SignupDtoImp implements SignupDTO {

	@Autowired
	EntityManager entityManager;

	@Override
	public void createUser(User user) {
		 Session currentSession = entityManager.unwrap(Session.class);
	        
	        // Save or update the candidate object
	        currentSession.merge(user);
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	


}
