package com.Directory.DTO;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Directory.model.User;


import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

@Service
public class LoginDtoImp implements LoginDTO {

	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public User findByEmail(String email) {
		 Session currentSession = entityManager.unwrap(Session.class);
	        
		 Query<User> query = currentSession.createQuery("FROM User WHERE email = :email", User.class);
		    query.setParameter("email", email);

		    User user = null;
		    try {
		        user = query.getSingleResult(); 
		        System.err.println(query.getSingleResult());// Get the single user result
		    } catch (NoResultException e) {
		        // No user found for the given email, return null
		        System.out.println("No user found with email: " + email);
		    } catch (Exception e) {
		        // Handle any other exceptions
		        e.printStackTrace();
		    }

		    return user; }
	}
