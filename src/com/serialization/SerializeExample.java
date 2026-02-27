package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {

		Employee emp = new Employee(999,"Alka Joshi");
		
		try(FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(emp);
		} catch(IOException io) {
			io.getStackTrace();
		}		
		System.out.println("Object serialized successfully!");
	}

}
