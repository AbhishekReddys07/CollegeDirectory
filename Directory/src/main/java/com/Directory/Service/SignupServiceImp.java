package com.Directory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Directory.DTO.SignupDTO;
import com.Directory.model.User;

import jakarta.transaction.Transactional;

@Service
public class SignupServiceImp implements SignupService {
	
	@Autowired
	private SignupDTO sighDto;
	
	@Transactional
	public void createUser(User user) {
		 sighDto.createUser(user);
	}

	@Override
	@Transactional
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
