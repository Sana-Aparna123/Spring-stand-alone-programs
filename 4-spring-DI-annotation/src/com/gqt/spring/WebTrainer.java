package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("web")
public class WebTrainer  implements Trainer{

	@Override
	public String dailyPractice() {
		return "Create an one webpage Daily";
	}

}
