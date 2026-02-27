package com.program.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "earthi";
		String str2 = "heart";

		if (str1.length() != str2.length()) {
			System.out.println("Given string are not anagram");
		} else {

			char[] str1Arr = str1.toCharArray();
			char[] str2Arr = str2.toCharArray();

			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);

			boolean b =Arrays.equals(str1Arr, str2Arr);
			if(b) {
				System.out.println("Given strings are anagram");
			}

		}

	}

}
