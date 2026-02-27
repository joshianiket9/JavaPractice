package com.singleton.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		DatabaseConnectionManager db1 = DatabaseConnectionManager.getDatabaseConnectionManager();
		DatabaseConnectionManager db2 = DatabaseConnectionManager.getDatabaseConnectionManager();
		
		System.out.println(db1.hashCode());
		System.out.println(db2.hashCode());
		
		if(db1 == db2) {
			System.out.println("DatabaseConnectionManager is singleton");
		}
			
		
	/*	Constructor<DatabaseConnectionManager> constructor = DatabaseConnectionManager.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		DatabaseConnectionManager db3 = constructor.newInstance();
		System.out.println(db3.hashCode()); */

		StaticInnerSingleton inst1 = StaticInnerSingleton.getStaticInnerSingleton();
		StaticInnerSingleton inst2 = StaticInnerSingleton.getStaticInnerSingleton();
		
		System.out.println(inst1.hashCode());
		System.out.println(inst2.hashCode());
		
		Constructor<StaticInnerSingleton> constructor = StaticInnerSingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		StaticInnerSingleton db3 = constructor.newInstance();
		System.out.println(db3.hashCode());
	}
}