package com.spring.datajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.datajpa.entities.Student;
import com.spring.datajpa.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;

	//Perform inserted operation only one student
	@Override
	public boolean addStudentDetails(Student std) {
		boolean status=false;
		try {
			studentRepository.save(std);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		return status;
	}

	//perform getting operation for all the student
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	//perform getting operation only one student
	@Override
	public Student getStudentById(long id) {
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	//perform update operation
	@Override
	public boolean updateStudent(long id, float marks) {
		//when we update any data first we get the data from the database
		Student studentById = getStudentById(id);
		if(studentById!=null) {
			studentById.setMarks(marks);
			studentRepository.save(studentById);
		}
		return false;
	}

	//perform delete operation
	@Override
	public boolean deleteStudent(long id) {
		boolean status=false;
		try {
			studentRepository.deleteById(id);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		return status;
	}

}
