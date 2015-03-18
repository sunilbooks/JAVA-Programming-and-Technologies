package unit3.yr2010;

import java.awt.*;
import java.io.*;

/**
 * Write a program to get character input from the keyboard and to put the
 * characters where the mouse points.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class ReadKBWriteMousePointer {

	public static void main(String[] args) throws Exception {

		// Read Characters from Keyboard
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(
				System.in));
		String chars = stdIn.readLine();

		// Identify Mouse Pointer points
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		System.out.println(x + ":" + y);

		// Display Text at Mouse Location
		Frame f = new Frame();
		f.setLocation(x, y);
		f.add(new Label(chars));
		f.pack();
		f.setVisible(true);
	}

}
