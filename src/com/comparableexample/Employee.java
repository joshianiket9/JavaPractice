package com.comparableexample;

public class Employee implements Comparable{

	private int id;
	private String fName;
	private int age;
	
	public Employee(int id, String fName, int age) {
		super();
		this.id = id;
		this.fName = fName;
		this.age = age;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {

		Employee e = (Employee) o;
		
		if(e.getfName().compareTo(this.fName) > 0)
		return -1;
		else if(e.getfName().compareTo(this.fName) < 0)
		return 1;
		else
		return 0;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", age=" + age + "]";
	}	
	
	
}