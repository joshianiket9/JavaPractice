package com.practice;

import java.util.List;

public class Employee {

	String name;
	int age;
	List<String> subjects;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, List<String> subjects) {
		super();
		this.name = name;
		this.age = age;
		this.subjects = subjects;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	
	
}
