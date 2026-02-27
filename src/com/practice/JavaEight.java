package com.practice;

import java.util.Random;
import java.util.function.Function;

public class JavaEight {

	public static void main(String[] args) {

		String in = "aniket";
		
		 Function<String,String> fn = str -> str.toUpperCase();
		 
		 System.out.println(fn.apply(in));
	}

}
