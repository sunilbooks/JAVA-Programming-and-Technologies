package unit4.yr2013;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Deserialize an object to a File.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestDeserialize {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("c:/employee.ser");

		ObjectInputStream in = new ObjectInputStream(file);

		// Deserialize an Object
		Employee e = (Employee) in.readObject();
		in.close();
		file.close();

		System.out.println("Employee Info");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
	}
}
