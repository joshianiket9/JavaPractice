package com.practice;

import java.util.Arrays;
import java.util.List;

public class ArraysPractice {

	public static void main(String[] args) {
   
		int[] numbers; // declaration
		
		int num[];      // declaration
		
		int[] numbers1 = new int[5];  // declaration + allocation
		int numbers2[] = new int[5];  // declaration + allocation
		
		numbers1[0]=1;
		numbers1[1]=2;
		numbers1[2]=3;
		numbers1[3]=4;
		numbers1[4]=5;
		System.out.println(" printing array");
		for(int x:numbers1) {
			System.out.print(x+" ");
		}
		System.out.println("\n assigning new values to array");
		for(int j=0;j<numbers1.length;j++) {
			numbers1[j]=j;
		}
		System.out.println(" printing new array");
		for(int x:numbers1) {
			System.out.print(x+" ");
		}
		
		int[] numbers3 = {1,2,3,4,5};  // initialization
		int numbers4[] = {6,7,8,9};    //  initialization
		
		for(int i:numbers4) {
		//	System.out.print(i+" ");
		}
		
		Employeee[] employees = new Employeee[3];
		Employeee employeees[] = new Employeee[2];
		
		Employeee e1 = new  Employeee();
		Employeee e2 = new  Employeee();
		
		Employeee[] arr = {e1,e2}; 
		
		List<String> list = Arrays.asList("Aniket","Amit","java");
		
		List<Object> ll =Arrays.asList(1,"sso",e1);
		System.out.println(ll);
	}

}
