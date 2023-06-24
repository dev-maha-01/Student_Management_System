package com.mile.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mile.sms.entity.Student;
import com.mile.sms.service.StudentService;

import jakarta.websocket.server.PathParam;

@Controller
public class StudentController {
	@Autowired
	private StudentService sServ;
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", sServ.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
			Student stu=new Student();
			model.addAttribute("student", stu);
			return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student stu) {
		sServ.saveStudent(stu);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student", sServ.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student) {
		Student dbStudent=sServ.getStudentById(id);
		
		dbStudent.setId(id);
		dbStudent.setFirstName(student.getFirstName());
		dbStudent.setLastName(student.getLastName());
		dbStudent.setEmail(student.getEmail());
		
		sServ.updateStudent(dbStudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudentForm(@PathVariable Long id,Model model) {
		sServ.deleteStudentById(id);
		return "redirect:/students";
	}
}
