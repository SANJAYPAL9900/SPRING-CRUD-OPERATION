package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.User;
import com.spring.service.UserService;

@RestController  //combination of @Controller and @ResponseBody
public class MyController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User addUserdetails(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getSingleUser(@PathVariable int id) {
		User singleUser = userService.getSingleUser(id).orElse(null);
		if(singleUser!=null) {
			return ResponseEntity.ok().body(singleUser);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody User user){
	User updateUser=userService.updateUser(id, user);
	if(user!=null) {
		return ResponseEntity.ok().body(updateUser);		
	}
	else {
		return ResponseEntity.notFound().build();
	}
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable int id) {
	 userService.deleteUser(id);
	 return ResponseEntity.noContent().build();
	
	}
}











