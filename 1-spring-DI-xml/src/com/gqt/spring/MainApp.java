package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//this is the path where we handle the spring to create object
		ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("config.xml");
		//spring create the object
		Employee e=(Employee) cpx.getBean("emp");//which is present name="emp" in config.xml file.
		System.out.println(e);
		System.out.println(e.getName());
		System.out.println(e.getExperience());

	}

}
