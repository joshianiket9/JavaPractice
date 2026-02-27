package com.practice;

import com.methodreference.Addition;

public class NumberSwap {

	protected int z = 10;
	public int w = 20;
	private int p = 99;
	int f = 00;
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		int temp = a;
		 a = b;
		 b = temp;
		 
		 System.out.println("a = "+a+" b= "+b);
		 
		 
		 //without using 3rd variable
		 
		 int x = 100;
		 int y = 200;
		 
		 x = x+y;
		 y = x-y;
		 x = x-y;
		 
		 System.out.println("x= "+x+" y= "+y);
		 
		 Addition ad = new Addition(4,5);
	}

}
