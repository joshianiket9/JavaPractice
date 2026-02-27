package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExample {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for a ");
		int a =sc.nextInt();
		System.out.println("enter the value for b ");
		int b = sc.nextInt();
		
		Calculator cal = (x,y) ->  a+b+100;
		int result = cal.add(a, b);
		System.out.println(result);
		
		System.out.println("enter a string ");
		String input = sc.nextLine();
		
		Function<String,String> fn = str -> str.toUpperCase();
		Function<String,Integer> fn2 = str -> str.length();
		
		System.out.println(fn.apply(input));*/
		
		String[] arrString = {"aniket","anand","alka","ashok","chaitali"}; 
		List<String> strList = Arrays.asList(arrString);
		List<String> ss = strList.stream().map(str -> str.toUpperCase()).filter(s -> s.contains("K")).collect(Collectors.toList());

		Integer[] intArr = {5,6,7,8,5,4,7,10};
		List<Integer> intList = Arrays.asList(intArr);
		Optional<Integer> ndmax = intList.stream().sorted(Comparator.naturalOrder()).distinct().skip(1).findFirst();
				
		//System.out.println(ndmax.get());
		
		Optional<Integer>inttt = intList.stream().limit(5).skip(1).max(Comparator.naturalOrder());
		
		System.out.println(inttt.get());
	}

}