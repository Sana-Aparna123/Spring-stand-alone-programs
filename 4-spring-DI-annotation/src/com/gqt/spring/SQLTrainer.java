package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("sql")
public class SQLTrainer implements Trainer{

	@Override
	public String dailyPractice() {
		return "Practice Queries daily";
	}

}
