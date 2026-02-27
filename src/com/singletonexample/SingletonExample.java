package com.singletonexample;

public class SingletonExample {

	private static volatile SingletonExample instance;

	private SingletonExample() {
		if(instance != null) {
			throw new RuntimeException("SingletonExample instance already exists!!!");
		}
	}

	public static SingletonExample getInstance() {
		if (instance == null) {
			synchronized (SingletonExample.class) {
				if (instance == null) {
					instance = new SingletonExample();
				}
			}
		}
		return instance;
	}
	
}
