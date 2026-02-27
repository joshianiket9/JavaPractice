package com.singletonexample;

public enum SingletonEnum {

	INSTANCE;
	
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}
}
