package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem2Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1= new Student("sumit","verma","sumit@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2= new Student("sunil","verma","sunil@gmail.com");
//		studentRepository.save(student2);
	}

}
