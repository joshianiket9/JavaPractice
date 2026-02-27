package com.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClientEmployee {

	public static void main(String[] args) {

		Employees e1 = new Employees(11, "Aniket", "Java", 375000);
		Employees e2 = new Employees(12, "Anand", "Java", 76000);
		Employees e3 = new Employees(13, "Dilip", "Java", 85000);
		Employees e4 = new Employees(14, "Anant", "Cloud", 175000);
		Employees e5 = new Employees(15, "vikas", "Java", 75000);
		Employees e6 = new Employees(16, "Amol", "Cloud", 95000);
		Employees e7 = new Employees(17, "Arpit", "Java", 75000);
		Employees e8 = new Employees(18, "Gaurav", "Java", 275000);
		Employees e9 = new Employees(19, "Sagar", "Cloud", 78000);
		Employees e10 = new Employees(20, "Zameer", "Cloud", 475000);

		List<Employees> list = List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

		Map<String, Optional<Employees>> emp = list.stream().collect(Collectors.groupingBy(Employees::getDepartment,
				Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))));
		System.out.println(emp);
	}

}
