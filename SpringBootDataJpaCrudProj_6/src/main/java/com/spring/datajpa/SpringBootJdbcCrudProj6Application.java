package com.spring.datajpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.datajpa.entities.Student;
import com.spring.datajpa.service.StudentService;
import com.spring.datajpa.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootJdbcCrudProj6Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcCrudProj6Application.class, args);
		StudentService studentService = context.getBean(StudentServiceImpl.class);
	
		//-----------------INSERT OPERATION--------------------------
//		Student student=new Student();
//		student.setName("Aditya");
//		student.setMarks(67.0f);
//		student.setRollno(102);
//		boolean studentDetails = studentService.addStudentDetails(student);
//		if(studentDetails) {
//			System.out.println("Data Inserted Successful");
//		}
//		else {
//			System.out.println("Data not inserted...!!!");
//		}
		
		//-----------------SELECT OPERATION 1---------------------
//		List<Student> allStudents = studentService.getAllStudents();
//		for(Student student:allStudents) {
//			System.out.println("Id: "+student.getId());
//			System.out.println("Name: "+student.getName());
//			System.out.println("RollNo: "+student.getRollno());
//			System.out.println("Marks: "+student.getMarks());
//			System.out.println("-----------------------");
//		}
		
		//-----------------SELECT OPERATION 2---------------------
//		Student studentById = studentService.getStudentById(3);
//		if(studentById!=null) {
//			System.out.println("Id: "+studentById.getId());
//			System.out.println("Name: "+studentById.getName());
//			System.out.println("RollNo: "+studentById.getRollno());
//			System.out.println("Marks: "+studentById.getMarks());
//		}
//		else {
//			System.out.println("Student not found...!!!");
//		}
		
		//----------------UPDATE OPERATION------------------------
//		boolean status = studentService.updateStudent(1, 88.5f);
//		if(!status) {
//			System.out.println("Student details updated...!!!");
//		}
//		else {
//			System.out.println("Student details not updated...!!!");
//		}
		
		//------------------DELETE OPERATION-----------------------
		boolean status = studentService.deleteStudent(2L);
		if(status) {
			System.out.println("Student Delete successfull...!!!");
		}
		else {
			System.out.println("Student not deleted...!!!");
		}
		
	}

}







