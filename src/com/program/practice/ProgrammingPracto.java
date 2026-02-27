package com.program.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProgrammingPracto {

	public static void main(String[] args) {

		// Question - Given a sentence, find the word with highest length
		String str = "I am Aniket Joshi and I am a java programmer";
		List<Integer> inta = Arrays.asList(1,2,8,9,7,10);
		List<Integer> liInt = List.of(1,2,3,4,5);
		
		int[] ar = {11,12,13,14,15};
		String[] strarrr = {"ani","vibha","saru"};
		 //List<String> liArrrrr = List.of(strarrr);
		 //liArrrrr.add("Aniket");
		 //System.out.println(" liArrrrr "+liArrrrr);
		 
		String[] strArr = str.split(" ");
		String maxLenStr = Arrays.stream(strArr).max(Comparator.comparing(s ->s.length())).get();
		System.out.println(maxLenStr);
		
		// sort the integer array in ascending order
		Integer[] intArr = {2,6,3,4,9,10,1,5};
		List<Integer> nums = Arrays.stream(intArr).sorted().collect(Collectors.toList());
		System.out.println(nums);
		
		// sort the integer array in descending order
		List<Integer> numsArr = Arrays.stream(intArr).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(numsArr);
		
		List<Integer> arr = Arrays.asList(intArr);
		List<Integer> result =  arr.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		
		// remove duplicate characters
		String str1 = "Characteristics";
		str1.chars().distinct().mapToObj(x ->(char)x).forEach(System.out::print);
		
		// remove character a
		String str2 = "Characteristics";
		String s1 = str2.replace(String.valueOf("a"), "");
		System.out.println(s1);

		// Question -  Find the word in a sentence which has second highest length
		
		String str3 = "Hi I am Aniket Joshi I am a software professional";
		String res = Arrays.stream(str3.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(res);
		
		Integer ii = Arrays.stream(str3.split(" ")).map(s ->s.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(ii);
		
		// count the number of occurrence of each word in sentence.
		Map<String,Long> maap = Arrays.stream(str3.split(" ")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(maap);
		
		String str4 = "Hello World";
		Map<Character,Long> mapList = str4.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(mapList);
		
		// Reverse the string using stream API
		IntStream.range(0, str4.length()).mapToObj(i ->str4.charAt(str4.length()-1-i)).forEach(System.out::print);
		String reversedString = IntStream.range(0, str4.length()).mapToObj(i ->str4.charAt(str4.length()-1-i)).map(String::valueOf).collect(Collectors.joining());
		System.out.println(reversedString);
		
		// check if 2 strings are anagram using stream API
		String strOne = "earth";
		String strTwo = "heart";
		
		if(strOne.length()!=strTwo.length()) {
			System.out.println("NOT anagram"); 
		}
		
		String sortedStr1 = strOne.chars().sorted().mapToObj(c ->String.valueOf(c)).collect(Collectors.joining());
		String sortedStr2 = strTwo.chars().sorted().mapToObj(c -> String.valueOf(c)).collect(Collectors.joining());
		
		boolean bb = sortedStr1.equals(sortedStr2);
		System.out.println(bb?"Anagram":"not anagram");
		
		
		
	}
}