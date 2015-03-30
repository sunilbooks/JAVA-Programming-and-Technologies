package unit3.yr2014;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Write a simple Java program to create a 4*4 grid and fill it in with 15
 * buttons, each labeled with its index.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class Create4x4Grid {

	public static void main(String[] args) {

		// Create Window
		Frame f = new Frame("4*4 Grid Window");

		// Make a 4*4 Grid
		GridLayout layout = new GridLayout(4, 4);
		// Set layout to Grid
		f.setLayout(layout);

		Button b = null;

		// Add 15 Buttons to Grid
		for (int i = 1; i < 16; i++) {
			b = new Button(String.valueOf(i));
			f.add(b);
		}

		// Set size of window
		f.setSize(200, 200);

		// Display window
		f.setVisible(true);

		// Close the window when click on windows close icon
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
