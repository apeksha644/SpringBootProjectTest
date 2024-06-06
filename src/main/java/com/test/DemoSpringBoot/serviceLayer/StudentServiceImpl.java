package com.test.DemoSpringBoot.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.DemoSpringBoot.model.Student;
import com.test.DemoSpringBoot.repository.StudentRepo;

@Service
public class StudentServiceImpl {
	

	@Autowired
	private StudentRepo repo;

	public List<Student> getDetails() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		return repo.findAll();
	}

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	public Student getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public Student getByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

}
