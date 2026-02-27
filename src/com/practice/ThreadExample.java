package com.practice;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExample implements Runnable {

	 static AtomicInteger  count = new AtomicInteger();
	@Override
	public void run() {

		for(int i=0;i<5000;i++) {
			count.incrementAndGet();
		}
	}
}
