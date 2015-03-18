package unit4.yr2010;
import java.io.FileReader;
import java.io.LineNumberReader;

/**
 * Write a program to read the contents of a text file one line at time and
 * print the lines with line numbers.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadLinePrintWithLineNumber {

	public static void main(String[] args) throws Exception {

		//Open the File
		FileReader file = new FileReader("d:/test.txt");

		// Open reader to read line and line number
		LineNumberReader in = new LineNumberReader(file);

		// Read Line
		String line = in.readLine();

		// Read Line
		int lineNo = in.getLineNumber();

		// Print line until line is NULL
		while (line != null) {
			System.out.println(lineNo + ":" + line);
			line = in.readLine();
			lineNo = in.getLineNumber();
		}

		// Close File
		file.close();
		in.close();
	}
}
