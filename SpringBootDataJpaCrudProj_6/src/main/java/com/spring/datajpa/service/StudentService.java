package com.spring.datajpa.service;

import java.util.List;

import com.spring.datajpa.entities.Student;

public interface StudentService {
	//inserting method
	public boolean addStudentDetails(Student std);
	//getting all the data method
	public List<Student> getAllStudents();
	//getting only one data 
	public Student getStudentById(long id);
	//update method
	public boolean updateStudent(long id, float marks);
	//delete method
	public boolean deleteStudent(long id);
}
