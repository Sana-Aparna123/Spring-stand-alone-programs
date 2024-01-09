package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaTrainer implements Trainer {

	@Override
	public String dailyPractice() {
		return "Practice Java Programs Daily";
	}
	

}
