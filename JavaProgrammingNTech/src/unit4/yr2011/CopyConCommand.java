package unit4.yr2011;

import java.io.*;

/**
 * Write a program to get input from keyboard using buffer reader and write
 * using buffer writer.
 * 
 * Program reads line by line from Keyboard and Write to a text file until user
 * type string "quit".
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class CopyConCommand {

	public static void main(String[] args) throws Exception {

		// Open a Text file to write data
		FileWriter file = new FileWriter("c:/temp.txt");

		// Make BufferedWriter class object to write data Line by Line
		BufferedWriter out = new BufferedWriter(file);

		// Read Data from Keyboard Chat by Char
		InputStreamReader isReader = new InputStreamReader(System.in);

		// Read Data from Keyboard line by line
		BufferedReader in = new BufferedReader(isReader);

		// Read first Line from Keyboard
		String line = in.readLine();

		// If line is quit then stop reading data and close text file
		while (!line.equals("quit")) {
			// Write line to File
			out.write(line + "\n");

			// Read next line from Keyboard
			line = in.readLine();
		}

		// Close file
		out.close();
		file.close();

	}

}
