package com.example.rjany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.rjany.model.Student;
import com.example.rjany.service.StudentService;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
	 	return studentService.getAllStudent();
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		return studentService.deleteStudent(id);
	}

}
