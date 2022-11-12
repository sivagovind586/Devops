package com.student.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.info.Entity.Student;
import com.student.info.Repository.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
          @Autowired
	     private StudentRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		
		/*
		 * Student s1=new Student("yogesh", "Shelar", "yogesh@123");
		 * 
		 * repo.save(s1);
		 * 
		 * Student s2=new Student("Manoj", "chavan", "manu@123"); repo.save(s2);
		 * 
		 * Student s3=new Student("sai", "yadav", "sai@123gmail.com");
		 * 
		 * repo.save(s1);
		 */
		
	}

}
