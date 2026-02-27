package com.comparableexample;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {

	public static void main(String[] args) {

		Byte[] by = new Byte[1024];
		List<Byte[]> li = new ArrayList<Byte[]>();
		
		while(true) {
			li.add(by);
		}
		
	}

}
