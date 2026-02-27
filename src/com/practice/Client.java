package com.practice;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		
		String str ="aniket";
		
		String ans = str.substring(3);
		
		System.out.println(ans);
		
		String answ = str.substring(0, 3);
		
		System.out.println(answ);
		
		String aa = str.substring(str.length() - 2);
		System.out.println(aa);
		try {
			Employees em = (Employees) Class.forName("com.practice.Employees")
					.getConstructor(int.class, String.class, String.class, double.class)
					.newInstance(45, "Aniket", "Joshi", 20000.00);
			System.out.println(em);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
