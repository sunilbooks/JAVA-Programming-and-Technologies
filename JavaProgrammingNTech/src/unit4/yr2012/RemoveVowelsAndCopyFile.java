package unit4.yr2012;

import java.io.*;

/**
 * Write a program to read a text file stored in the same directory as program
 * and write it to another text file without vowels present
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class RemoveVowelsAndCopyFile {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("in.txt");
		BufferedReader in = new BufferedReader(reader);

		FileWriter writer = new FileWriter("out.txt");
		PrintWriter out = new PrintWriter(writer);

		String line = in.readLine();

		while (line != null) {
			// Remove Vowels
			line = line.replaceAll("[aeiou]", "");

			// Write to new Text File
			out.println(line);

			// Read New Line
			line = in.readLine();
		}

		// Close Files
		reader.close();
		in.close();
		writer.close();
		out.close();
	}
}
