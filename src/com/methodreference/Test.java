package com.methodreference;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	
		
	// word count
	List<String> words = List.of("aniket","anand","aniket","chaitali","chaitali","chaitali");	
	Map<String,Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));	
	System.out.println(map);
	
	
	// Simple method reference example
	HashSet<String> set = new HashSet<String>();
	List<String> list = List.of("aniket","anand","synechron");	
	Consumer<String> display = a -> System.out.println(a);
	display.accept("accept function");
	list.forEach(display.andThen( x->set.add(x)));
	
	// method reference
	 list.forEach(a -> System.out.println(a));
	 list.forEach(System.out::println);
	// ends
	
	System.out.println("set is "+set);
	int a = 5;
	int b = 10;
	
	// Lambda expression
	Calculator cal = (x,y) -> x+y; 
	int result = cal.add(a, b);	
	System.out.println(result);
	
	// static Method reference
	Calculator c = MethodReferenceExample::addition;
	int re = c.add(a,b);
	System.out.println(re);
	
	// instance method reference
	Calculator calculator = new MethodReferenceExampleInstance()::addition;
	int res = calculator.add(a, b);
	System.out.println(res);
	
	//constructor method reference
	Additionable ad = Addition::new;
	ad.getAddition(a, b);
	
	// Predicate
	Predicate<String> pred = s ->s.length() > 10;
	
	Predicate<Integer> pp = i->i>3;
	
	list.stream().filter(pred).collect(Collectors.toList());
	System.out.println(pp.test(4));
	
	}
}