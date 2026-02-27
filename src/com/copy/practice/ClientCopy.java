package com.copy.practice;

public class ClientCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Pune");
		
		Employee emp1 = new Employee(1,address);
		
		Employee emp2 = (Employee) emp1.clone();
		
		//emp2.address.city = "Mumbai";
		
		emp2.getAddress().setCity("Mumbai");
		
		System.out.println(emp1.getAddress().getCity());
		System.out.println(emp2.getAddress().getCity());
	}

}
