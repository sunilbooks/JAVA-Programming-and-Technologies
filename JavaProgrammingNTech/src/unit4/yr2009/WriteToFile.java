package unit4.yr2009;

import java.io.FileWriter;

/**
 * Read text from a file.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class WriteToFile {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("d:/test.txt");

		String text = "SUNRAYS Technologies";

		file.write(text.toCharArray());

		file.close();

		System.out.println("File is successfully written");
	}
}
