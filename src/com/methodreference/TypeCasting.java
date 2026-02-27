package com.methodreference;

public class TypeCasting {

	public static void main(String[] args) {

	byte b = 5;
	
	short s = b;
	
	int i = s;
	
	long l = i;
	
	float f = l;
	
	double d = f;
	
	System.out.println("byte b is "+d);
	System.out.println("short s is "+d);
	System.out.println("integer i is "+d);
	System.out.println("long l is "+d);
	System.out.println("float f is "+d);
	System.out.println("double d is "+d);
	
	
	String str = "Java";
	
	str.concat("Developer");
	
	System.out.println(str);
	
	StringBuffer sb = new StringBuffer("Java");
	sb.append("Developer");
	
	System.out.println(sb);
	
	}

}
