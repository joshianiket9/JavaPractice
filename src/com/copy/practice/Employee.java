package com.copy.practice;

public class Employee implements Cloneable{

	 private int id;
	 private Address address;
	
	Employee(int id, Address address){
		this.id = id;
		this.address = address;
	}
	
	// Shallow Copy
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	// Deep Copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Employee emp = (Employee) super.clone();
		emp.address = new Address(this.getAddress().getCity());			
		return emp;
	}
	
	
}
