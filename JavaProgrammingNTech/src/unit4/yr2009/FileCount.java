package unit4.yr2009;

import java.io.FileReader;

/**
 * Write a program in Java that will count the number of characters, words and
 * lines in a file. The file name should be passed as a command line argument.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class FileCount {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader(args[0]);

		int c = 0, w = 0, l = 0;

		int ch = reader.read();
		char chr;
		while (ch != -1) {
			chr = (char) ch;
			c++;// Increase Character
			if ((chr == ' ') || (chr == '\n')) {
				w++; // Increase Word Count
			}
			if (chr == '\n') {
				l++; // Increase Line
			}
			ch = reader.read();
		}

		System.out.println("No of Characters in File=" + c);
		System.out.println("No of Words in File=" + w);
		System.out.println("No of Lines in File =" + l);
	}
}
