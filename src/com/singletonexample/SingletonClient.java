package com.singletonexample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClient {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {

		SingletonExample s1 = SingletonExample.getInstance();
		System.out.println(s1.hashCode());

		SingletonExample s2 = SingletonExample.getInstance();

		SingletonExample s3 = SingletonExample.getInstance();

		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		Constructor<SingletonExample> constructor = SingletonExample.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonExample ss = constructor.newInstance();
		System.out.println(ss.hashCode());
		
	}

}
