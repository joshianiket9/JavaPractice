package com.program.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaEightStreams {

	public static void main(String[] args) {

		// Question - Given a sentence, find the word with highest length
		
		String str = "I am a java prgrammer characteristics";
		
		String result = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
		System.out.println(result);
		
		
		// Question -  Remove the duplicate character from the string and return in the same order
		
		String str1 = "characteristics";
		
		// first approach
		str1.chars().distinct().mapToObj(x ->(char)x).forEach(System.out::print);
		
		//second approach
		Arrays.stream(str1.split("")).distinct().forEach(System.out::print);
		
		// Question -  Find the word in a sentence which has second highest length
		
		String re = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(re);
		
		// Question - Find the second highest length of the word in sentence
		
		int secondHighestLength = Arrays.stream(str.split(" ")).map(String::length).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHighestLength);
		
		// Question - Given a sentence, find the occurrence of each word // count the word in a sentence  
		
		String demoStr = "I am learning java and I am big fan of java";
		Map<String,Long> map = Arrays.stream(demoStr.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		// Question - Given a sentence, find the words with specified number of vowels
		String vowelStr = "I am learning java stream api";
		List<String> li =Arrays.stream(vowelStr.split(" ")).filter(x ->x.replaceAll("[^aeiouAEIOU]", "").length()==2).collect(Collectors.toList());
		System.out.println(li);
		
		// Question - Divide the given list of integers into list of even and odd
		int[] intarr ={1,2,3,4,5,6,7,8,9,11};
		List<List<Integer>> collectLists = Arrays.stream(intarr).boxed()
				.collect(Collectors.groupingBy(x -> x%2 ==0,Collectors.toList()))
				.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
		System.out.println(collectLists);
		
		//Question - Given a string / word, find the occurrence of each character
		
		String word = "characteristics";
		Map<String,Long> charCounting = Arrays.stream(word.split("")).collect(Collectors.groupingBy(x ->x,Collectors.counting()));
		System.out.println(charCounting);
		
		// Question - Given a string / word, find the highest occurrence of character
		Map.Entry<String, Long> highestOccChar = Arrays.stream(word.split("")).collect(Collectors.groupingBy(x ->x,Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();

		// Question - Sort the integer array in ascending and descending
		int[] intar = {1,3,5,2,88,90,4};
		
		//Ascending order
		List<Integer> listNum = Arrays.stream(intar).mapToObj(x->x).sorted().collect(Collectors.toList());	
		System.out.println(listNum);
		
		//Descending order
		List<Integer> listNumDesc = Arrays.stream(intar).mapToObj(x->x).sorted(Comparator.reverseOrder()).collect(Collectors.toList());	
		System.out.println(listNumDesc);
	
		// Given an array, find the sum of unique numbers
		int[] uniqueNum = {2,3,4,2,3,6,7,7,9};
		
		int uniqueNumSum = Arrays.stream(uniqueNum).distinct().sum();
		System.out.println("sum of unique numbers "+uniqueNumSum);
		
		// Question - Given a string, find the first non-repeated character
		String nonRepeatedChar = "characteristics";
		
		// compare 2 arrays - order does not matter
		
		Integer[] arr1 = {2,5,7,3};
		Integer[] arr2 = {5,2,7,3};
			
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1,arr2)) {
			System.out.println("Arrays are equal");
		}
	}
}