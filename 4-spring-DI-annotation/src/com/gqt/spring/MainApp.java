package com.gqt.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//this is the path where we handle the spring to create object
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
		
		JavaTrainer jt1 = (JavaTrainer) cpx.getBean("java");
		JavaTrainer jt2 = (JavaTrainer) cpx.getBean("java");
		System.out.println(jt1.dailyPractice());
		System.out.println(jt1);
		System.out.println(jt2);
		
		WebTrainer wt1=(WebTrainer) cpx.getBean("web");
		WebTrainer wt2=(WebTrainer) cpx.getBean("web");
		System.out.println(wt1.dailyPractice());
		System.out.println(wt1);
		System.out.println(wt2);
		
		SQLTrainer st1=(SQLTrainer) cpx.getBean("sql");
		SQLTrainer st2=(SQLTrainer) cpx.getBean("sql");
		System.out.println(st1.dailyPractice());
		System.out.println(st1);
		System.out.println(st2);
	}

}
