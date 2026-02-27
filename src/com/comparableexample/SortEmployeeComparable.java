package com.comparableexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployeeComparable {

	public static void main(String[] args) {

		Employee e1 = new Employee(1,"Zoya", 25);
		Employee e2 = new Employee(2,"Aniket", 35);
		Employee e3 = new Employee(3,"Prem", 50);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		Collections.sort(empList);
		
		System.out.println(empList);
		
		
		Collections.sort(empList, new EmployeeSortByAge());
		System.out.println(empList);
		
		System.gc();
	}

	@Override
	protected void finalize() {
		System.out.println("Finalize method is called");
	}
	
}
