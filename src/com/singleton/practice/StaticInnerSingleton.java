package com.singleton.practice;

public class StaticInnerSingleton {

	private StaticInnerSingleton() {
		
	}
	
 private static class SingletonHelper {
	 private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
 }
	
	public static StaticInnerSingleton getStaticInnerSingleton() {
		return SingletonHelper.INSTANCE;
	}
}