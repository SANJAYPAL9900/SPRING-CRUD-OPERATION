package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.entities.User;

public interface UserService {
	public User createUser(User user);
	public List<User> getAllUsers();
	public Optional<User> getSingleUser(int id);
	public User updateUser(int id, User newUser);
	public void deleteUser(int id);
}
