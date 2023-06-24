package com.mile.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mile.sms.entity.Student;
import com.mile.sms.repository.StudentRepository;
import com.mile.sms.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository sRepo;
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> stuList=sRepo.findAll();
		return stuList;
	}

	@Override
	public Student saveStudent(Student student) {
		Student stu=sRepo.save(student);
		return stu;
	}

	@Override
	public Student getStudentById(Long id) {
		return sRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return sRepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		sRepo.deleteById(id);
	}

}
