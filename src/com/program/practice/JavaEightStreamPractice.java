package com.program.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaEightStreamPractice {

	public static void main(String[] args) {

		// Question - Given a sentence, find the word with highest length
		
		String str = "I am Aniket Joshi and I am a java developer";
		
		String[] strArr = str.split(" ");
		String maxLen = Arrays.stream(strArr).max(Comparator.comparing(s->s.length())).get();
		System.out.println(maxLen);
	
		// Question -  Remove the duplicate character from the string and return in the same order
		
		String str1 = "characteristics";
		str1.chars().distinct().mapToObj(x ->(char)x).forEach( System.out::print);
		System.out.println("\n"+str1);
		Arrays.stream(str1.split("")).distinct().forEach(System.out::print);
		
		// Question - Find the word in a sentence which has second highest length
		 
		String str2 = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();    
		System.out.println(str2);
		
		// Question - Find the second highest length of the word in sentence
		int len = Arrays.stream(str.split(" ")).map(s ->s.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(len);
		
		// Question - Find the highest length of the word in sentence
		int leng = Arrays.stream(str.split(" ")).map(s ->s.length()).distinct().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(leng);
		
		// Question - Given a sentence, find the occurrence of each word // count the word in a sentence
		Map<String,Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(map);
		
		//sort the map by value
		Map<String,Long> mm = map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(mm);
		
		// // Question - Given a sentence, find the words with specified number of vowels
		String vowelStr = "I am learning java stream api";
		
		List<String> li = Arrays.stream(vowelStr.split(" ")).filter(x ->x.replaceAll("[^aeiouAEIOU]","").length() ==2).collect(Collectors.toList());
		System.out.println(li);
		
		//divide  the number array in even and odd
		int[] arrIntegers = {1,2,3,4,5,6,7,8,9,10,11};
		List<Integer> lis = Arrays.stream(arrIntegers).boxed().collect(Collectors.toList());
		List<List<Integer>> collect = lis.stream().collect(Collectors.groupingBy(x ->x%2 == 0, Collectors.toList())).entrySet().stream().map(x ->x.getValue()).collect(Collectors.toList());
		System.out.println(collect);
		
		//Question - Given a string / word, find the occurrence of each character
		Map<String, Long> collect2 = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(collect2);
		
		// Question - Given a string / word, find the highest occurrence of character
		Entry<String, Long> entry = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
		System.out.println(entry);
		
		// Question - Sort the integer array in ascending and descending
		int[] intsArr = {3,5,12,2,1,6,8,15,9,10,11};
		
		//Ascending order
		List<Integer> collect3 = Arrays.stream(intsArr).mapToObj(x->x).sorted().collect(Collectors.toList());
		// OR
		List<Integer> collect4 = Arrays.stream(intsArr).boxed().sorted().collect(Collectors.toList());
		System.out.println(collect3);
		
		// Descending order
		List<Integer> collect5 = Arrays.stream(intsArr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect5);
		
		// Given an array, find the sum of unique numbers
		
		int[] uniqueNo = {2,3,4,1,2,3,1,7,8,9};
		
		int re = Arrays.stream(uniqueNo).distinct().sum();
		System.out.println(re);
		//OR
		int result = Arrays.stream(uniqueNo).boxed().distinct().reduce(Integer::sum).get();
		System.out.println("result "+result);
		//OR
		Arrays.stream(uniqueNo).mapToObj(x->x).distinct().reduce(Integer::sum).get();
		
		// Question - Given a string, find the first non-repeated character
		String sampleString = "characteristics";
		
		String string = Arrays.stream(sampleString.split("")).filter(c ->sampleString.indexOf(c)==sampleString.lastIndexOf(c)).findFirst().get();
		System.out.println("first non repeated character "+string);
		// OR
		Map<Character, Long> collect6 = sampleString.chars().mapToObj(x ->(char)x).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect6);
		char ch = collect6.entrySet().stream().filter(m ->m.getValue()==1).map(x ->x.getKey()).findFirst().get();
		
		System.out.println("first non repeated char "+ch);
		
		// Question - Given a string, find the first non-repeated character
		String string2 = Arrays.stream(sampleString.split("")).filter(c ->sampleString.indexOf(c) !=sampleString.lastIndexOf(c)).findFirst().get();
		System.out.println("first repeated character "+string2);
		
		//OR 
		
		Map<Character, Long> collect7 = sampleString.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));
		char character = collect7.entrySet().stream().filter( n ->n.getValue()>1).map(s ->s.getKey()).findFirst().get();
		System.out.println("first repeated char "+character);
		
		// Question -Given an array of integer, group the numbers by range
		int[] arrIntt = {2,3,11,13,14,25,27,33,39,41};
		
		Map<Integer, List<Integer>> collect10 = Arrays.stream(arrIntt).boxed().collect(Collectors.groupingBy( s-> s/10*10,LinkedHashMap::new,Collectors.toList()));
		System.out.println(collect10);
		
		// Given a list of strings, create a list that contains only integers
		
		String[] strArr1 = {"abc","ZKX","123","pqr","xyz","789"};
		List<Integer> collect8 = Arrays.stream(strArr1).filter(x ->x.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(collect8);
		
		String text = "Java Regex";
		String ss = text.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(ss);
		System.out.println(text.replaceAll("[^aeiouAEIOU]", "").length());
		
		//Find the products of the first two elements in an array.
		
		int[] arrInt = {12,5,6,7,9,10};
		
		Integer reduce = Arrays.stream(arrInt).boxed().limit(2).reduce((a,b)->a*b).get();
		System.out.println(reduce);
		
		//Group /Pair anagrams from a list of Strings. 
		
		String[] strArray = {"pat", "pan", "tap","nap","meat","team","tree"};
		
		List<String> listStr = List.of(strArray);
		System.out.println(listStr);
		
		List<String> sss = Arrays.asList(strArray);
		System.out.println(sss);
		
		List<String> ars = Arrays.stream(strArray).collect(Collectors.toList());
		System.out.println(ars);
		
		// Given a number array, find the numbers starts with 1.
		int[] numbers = {79, 54,68,121,33,19,15,61,118};
		
		List<String> collect9 = Arrays.stream(numbers).boxed().map(x ->x.toString()).filter( t ->t.startsWith("1")).collect(Collectors.toList());
		System.out.println("numbers start with 1 are "+collect9);
		
		
		// Given a number array, find the numbers ends with 1.
		
		List<String> collect11 = Arrays.stream(numbers).boxed().map(x ->x.toString()).filter( p ->p.endsWith("1")).collect(Collectors.toList());
		System.out.println(collect11);
		
		// Given a sentence, count the word occurrence 
		String wordCount = "I am Aniket Joshi I am a software engineer I have a daughter";
		Map<String, Long> collect12 = Arrays.stream(wordCount.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(collect12);
		
		// Given map of string and Long, sort the entries on the basis of values
		Map<String,Long> mapval = new HashMap<String,Long>();
		mapval.put("Nitin", 45L);
		mapval.put("Aniket", 100L);
		mapval.put("Bipin", 43L);
		mapval.put("Zaheer", 10L);
		mapval.put("Chaitali", 20L);
		LinkedHashMap<String, Long> collect13 = mapval.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(collect13);
	}
}