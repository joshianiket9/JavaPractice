package com.practice;

public class VolatileExample  implements Runnable {

	static  boolean flag = true;
	
	@Override
	public synchronized void run() {
		
			while(flag) {
				System.out.println("I am inside while...");
			}
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		VolatileExample v = new VolatileExample();
		Thread t1 = new Thread(v);
		t1.start();
		
		t1.sleep(5000);
		flag = false;
		
		System.out.println("flag has become false..stopping while loop");
	}

	

}
