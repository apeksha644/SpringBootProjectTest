package com.test.DemoSpringBoot.serviceLayer;



import org.springframework.stereotype.Component;

import com.test.DemoSpringBoot.repository.StudentInterface;

@Component
public class Service1 implements StudentInterface{

	@Override
	public void getd() {
		// TODO Auto-generated method stub
		System.out.println("first service");
	}

	
	
}
