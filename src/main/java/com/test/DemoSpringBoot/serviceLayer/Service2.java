package com.test.DemoSpringBoot.serviceLayer;

import org.springframework.stereotype.Component;

import com.test.DemoSpringBoot.repository.StudentInterface;

@Component
public class Service2 implements StudentInterface {

	@Override
	public void getd() {
		// TODO Auto-generated method stub
		System.out.println("service 2");
	}
	
	

}
