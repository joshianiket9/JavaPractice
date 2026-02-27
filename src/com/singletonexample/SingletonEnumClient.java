package com.singletonexample;

public class SingletonEnumClient {

	public static void main(String[] args) {

	SingletonEnum s =	SingletonEnum.getInstance();
	SingletonEnum s1 = SingletonEnum.getInstance();
	
	System.out.println(s.hashCode());
	System.out.println(s.hashCode());
	
	}

}
