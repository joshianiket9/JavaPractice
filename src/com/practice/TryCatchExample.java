package com.practice;

public class TryCatchExample {

	public static void main(String[] args) {

		try {
			int i = 9 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic exception "+ae.getMessage());
		}catch (Exception e) {

		} 

	}

}
