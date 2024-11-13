package com.example.springboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springboot.beans.Student;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner commandLineRunner() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				student().display();
				System.out.println("---------------------------");
				student().display();
				
			}
		};
	}
	@Bean
	public Student student() {
		return new Student(123,"Sanjay",78.00);
	}
	
	@Bean
	public Student student1() {
		return new Student(125,"Deepak",68.00);
	}
}
