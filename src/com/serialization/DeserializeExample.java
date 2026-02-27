package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeExample {

	public static void main(String[] args){

		try(FileInputStream fis = new FileInputStream("Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis)){
			Employee ee = (Employee)ois.readObject();
			System.out.println("Object Deserialized successfully!");
			System.out.println(ee);
		} catch(IOException | ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
		
	}

}
