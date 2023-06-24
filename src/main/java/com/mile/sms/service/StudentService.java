package com.mile.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mile.sms.entity.Student;

@Service
public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student getStudentById(Long id);
	public Student updateStudent(Student student);
	public void deleteStudentById(Long id);
}
