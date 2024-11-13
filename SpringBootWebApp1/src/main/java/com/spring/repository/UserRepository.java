package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	//Here all the CRUD operation available....
	User findByEmail(String email);
}
