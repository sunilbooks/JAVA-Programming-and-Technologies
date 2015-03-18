package unit4.yr2009;

import java.io.FileReader;

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

public class ReadFromFile {
	public static void main(String[] args) throws Exception {
		// Open a File to read
		FileReader reader = new FileReader("c:/test.txt");
		// Read a Character at a time
		int ch = reader.read();
		char chr;

		while (ch != -1) {
			chr = (char) ch;
			System.out.print(chr);
			ch = reader.read();
		}
	}

}
