package com.test.DemoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.DemoSpringBoot.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	@Query("Select s from Student s where email= :email  ")
	Student findByEmail(@Param("email") String email);

}
