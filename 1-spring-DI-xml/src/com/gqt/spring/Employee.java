package com.gqt.spring;

public class Employee {
	private String name;
	private String experience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Employee(String name, String experience) {
		super();
		this.name = name;
		this.experience = experience;
	}

	public Employee() {
		super();
	}

}
