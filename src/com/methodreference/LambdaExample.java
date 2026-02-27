package com.methodreference;

public class LambdaExample {

	public static void main(String[] args) {

		GreetHelloWorld greet = () -> System.out.println("Hello World");
		greet.greetHelloWorld();
	}

}

@FunctionalInterface
interface GreetHelloWorld {

	void greetHelloWorld();
	
}