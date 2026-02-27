package com.singletonexample;

import java.util.Scanner;

public class IsEmptyIsBlank {

	public static void main(String[] args) {

		String str = "";
		
		boolean a = str.isEmpty();
		//System.out.println(a);
		// conclusion - isEmpty returns true only when size of string is zero. If isEmpty is true it means size of string is 0;
		
		String str1 = "";
		String str2 = " ";

		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		
	}

}
