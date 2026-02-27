package com.program.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI {

	public static void main(String[] args) {

		//1.	// print the numbers from 1 to 10 using stream API
		IntStream.range(1, 11).forEach(n -> System.out.print(n+" "));
		
		//2.	// add the number from 1 to 10 using stream API
		int sum = IntStream.range(1, 11).sum();
		System.out.println("\n"+sum);
		
		//3.	// print the even numbers from 1 to 10 using stream API
		List<Integer> evenInt = IntStream.range(1, 20).filter(x ->x%2==0).boxed().collect(Collectors.toList());
		System.out.println(evenInt);
		
		// print odd numbers from 1 to 20 using stream API
		List<Integer> collectOdd = IntStream.range(1, 20).filter(x ->x%2 !=0).boxed().collect(Collectors.toList());
		System.out.println(collectOdd);
		
		//4.	//reverse string using stream API
		String sample = "Hello World";
		
		String revString = IntStream.range(0, sample.length()).mapToObj(i -> sample.charAt(sample.length() - 1 - i))
				.map(c -> String.valueOf(c)).collect(Collectors.joining());
		
		System.out.println(revString);
		
		// IntStream.range(0,sample.length()) - equivalent to for loop from 0 to sample.length() -1
		// mapToObj(i ->sample.charAt(sample.length()-1-i)) - equivalent to converting int stream to stream of characters
		// .map(c -> String.valueOf(c)) - equivalent to converting character into string because Because Collectors.joining() works only with Stream<String>
		
		//5.	// Question - Given a sentence, find the word with highest length
		String sentence = "Hi I am Aniket Joshi I am a software professional";
		String stringLen = Arrays.stream(sentence.split(" ")).max(Comparator.comparing(s -> s.length())).get();
		System.out.println(stringLen);
		
		String stringLength = Arrays.stream(sentence.split(" ")).sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
		System.out.println(stringLength);
		
		// second highest
		String secondHighest = Arrays.stream(sentence.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(secondHighest);
		
		// find the highest length of word in the sentence
		Integer highestLength = Arrays.stream(sentence.split(" ")).map(x ->x.length()).sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(highestLength);
		
		//6.	//Question - Remove the duplicate character from the string and return in the same order
		String duplicateChar = "characteristics";
		String strAfterRemovingDuplicateChar = duplicateChar.chars().distinct().mapToObj(x->(char)x).map(x->String.valueOf(x)).collect(Collectors.joining());
		System.out.println(strAfterRemovingDuplicateChar);
		
		//7.	// Question - Find the word in a sentence which has second highest length
		String sen = "Earth is our Mother";
		String strin = Arrays.stream(sen.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(strin);
		
		
		//8.	// Question - Find the second highest length of the word in sentence
		Integer secondHighestLength = Arrays.stream(sen.split(" ")).map(x ->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHighestLength);
		
		//9.	// Question - Find the highest length of the word in sentence
		String line = "I am planning for long term association";
		Integer highestLe = Arrays.stream(line.split(" ")).map(x ->x.length()).sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(highestLe);
		
		String largestStr = Arrays.stream(line.split(" ")).sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
		System.out.println(largestStr);
		String large = Arrays.stream(line.split(" ")).max(Comparator.comparing(String::length)).get();
		System.out.println(large);
		
		//10.	// Question - Given a sentence, find the occurrence of each word // count the word in a sentence
		String wordCount = "I am Aniket Joshi and Aniket Joshi is a java professional java professional is nothing but java developer";
		Map<String, Long> wordCountMap = Arrays.stream(wordCount.split(" ")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(wordCountMap);
		
		//11.	//sort the map by value using stream API
		
		Map<String, Long> sortedMap = wordCountMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedMap);
		
		//12.	//sort the map by key
		Map<String,Long> map = new HashMap<String,Long>();
		map.put("Aniket",100L);
		map.put("Swati",10L);
		map.put("Zuheb",200L);
		map.put("Rajesh",300L);
		map.put("Spandana",1000L);
		map.put("Rupesh",500L);
		
		HashMap<String, Long> mapsort = map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(mapsort);
		// entrySet converts the map into Set of Map.Entry
		// stream converts entrySet into stream
		// sorted will sort the Map.Entry with comparingByKey OR comparingByValue - by default ascending - use reversed() for descending
		// .collect(collectors.toMap) will convert stream of Map.Entry into Map
		// parameter 1 - for key mapper
		// parameter 2 - for value mapper
		// parameter 3 - for merge function (e1,e2)->e1 if duplicate key present it will keep only one value, first value
		//LinkedHashMap to preserve insertion order
		
		//13.	// Question - Given a sentence, find the words with specified number of vowels
		//14.	//divide the number array in even and odd
		//15.	//Question - Given a string / word, find the occurrence of each character
		
		String charCount = "gitfetchandgitpull";
		Map<String, Long> charCountResult = Arrays.stream(charCount.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(charCountResult);
		//16.	// Question - Given a string / word, find the highest occurrence of character
		//17.	// Question - Sort the integer array in ascending and descending
		//18.	// Given an array, find the sum of unique numbers
		//19.	// Question - Given a string, find the first non-repeated character
		//20.	// Question -Given an array of integer, group the numbers by range
		//21.	// Given a list of strings, create a list that contains only integers
		//22.	//Find the products of the first two elements in an array.
		//23.	// Given a number array, find the numbers starts with 1.
		//24.	// Given a number array, find the numbers ends with 1.
		//25.	// Given map of string and Long, sort the entries on the basis of values

		
	}

}
