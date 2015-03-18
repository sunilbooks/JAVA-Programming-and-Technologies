package unit4.yr2013;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Serialize an object to a File.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestSerialization {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee();
		e.name = "Rahul";
		e.address = "Pune";

		// Open File
		FileOutputStream file = new FileOutputStream("c:/employee.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);

		// Serialize Object
		out.writeObject(e);

		// Close file
		out.close();
		file.close();
		System.out.println("Object is Serialized");
	}
}
