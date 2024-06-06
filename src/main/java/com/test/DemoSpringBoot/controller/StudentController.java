package com.test.DemoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.test.DemoSpringBoot.model.Student;
import com.test.DemoSpringBoot.serviceLayer.StudentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

// this is for test

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl serviceImpl;
	
	
	@GetMapping("/getDetails")
	public List<Student> getDetails() {
		return serviceImpl.getDetails();
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		//TODO: process POST request
		
		return serviceImpl.addStudent(student);
	}
	
	@GetMapping("/getID/{id}")
	public Student getById(@PathVariable int id) {
		return serviceImpl.getById (id);
	}
	
	
	@GetMapping("/serach")
	public Student getByEmail(@RequestParam String email) {
		return serviceImpl.getByEmail(email);
	}
		

	
	
	 

	
	
	
	
	
	

}
