package com.mile.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mile.sms.entity.Student;
import com.mile.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository sRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//dummy data for first time
//		for(int i=0;i<10;i++) {
//			Student stu=new Student("amish","tripathi","amish@gmail.com");
//			sRepo.save(stu);
//		}
		
	}

}
