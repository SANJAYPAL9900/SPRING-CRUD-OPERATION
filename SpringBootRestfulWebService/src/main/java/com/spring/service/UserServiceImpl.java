package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.entities.User;
import com.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getSingleUser(int id) {
		return userRepository.findById(id);
	}

	@Override
	public User updateUser(int id, User newUser) {
		User user=userRepository.findById(id).orElse(null);
		if(user!=null) {
			userRepository.save(newUser);
		}
		 throw new RuntimeException("User not found: "+id);
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
