package com.example.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired 
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("Arpit", "Namdeo", "abc@deg.com");
		studentRepository.save(s1);
		Student s2 = new Student("Golu", "Namdev", "golu@gmail.com");
		studentRepository.save(s2);
		Student s3 = new Student("Tony", "Stark", "tstark@starkindustry.com");
		studentRepository.save(s3);
		
	}

}
