package com.example.springboot;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

//import com.example.springboot.beans.Student;

@SpringBootApplication
public class SpringBootProject4Application{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject4Application.class, args);
	}

	
//------------------------------------------------------------------------------------------------------
	/*
	@SpringBootApplication
	public class SpringBootProject4Application implements CommandLineRunner{

		public static void main(String[] args) {
			SpringApplication.run(SpringBootProject4Application.class, args);
		}
	
	@Override
	public void run(String... args) throws Exception {
		student().display();
		System.out.println("----------------");
		student1().display();
	}
	
	@Bean
	public Student student() {
		return new Student(123,"Sanjay",78.00);
	}
	
	@Bean
	public Student student1() {
		return new Student(125,"Deepak",68.00);
	}
		*/
}
