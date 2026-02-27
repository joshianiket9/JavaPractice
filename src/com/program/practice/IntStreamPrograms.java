package com.program.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamPrograms {

	public static void main(String[] args) {

		// print the numbers from 1 to 10 using stream API
		IntStream.range(1, 11).forEach(n -> System.out.print(" "+n));
		
		// add the number from 1 to 10 using stream API
		int total = IntStream.range(1, 11).sum();
		System.out.println("\n"+total);
		
		// print the even numbers from 1 to 10 using stream API
		IntStream.range(1, 20).filter(x ->x%2 == 0).forEach(n -> System.out.print(n+" "));
		
		//reverse string using stream API
		String str = "Aniket Joshi";
		//IntStream.range(0, str.length()).mapToObj(i ->str.charAt(str.length()-1-i)).forEach(System.out::print);
		//IntStream.range(0,str.length()).mapToObj(i ->str.charAt(str.length()-1-i)).forEach(n ->System.out.print(n));
		String revstring = IntStream.range(0,str.length()).mapToObj(i ->str.charAt(str.length()-1-i)).map(n ->String.valueOf(n)).collect(Collectors.joining());
		System.out.println("\n"+revstring);
	}

}
