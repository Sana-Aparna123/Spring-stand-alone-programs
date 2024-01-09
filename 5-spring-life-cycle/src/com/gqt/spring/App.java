package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
		JavaTrainer jt=(JavaTrainer) cpx.getBean("java");
		//spring will automatically executes initMethod and destroyMethod internally by giving init-method and destroy-method names in config.xml
		//so we need to call customMethod.
		jt.customMethod();
		cpx.close();

	}

}
