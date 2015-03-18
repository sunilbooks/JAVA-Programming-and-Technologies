package unit3.yr2012;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 * Example of Grid Layout.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class ButtonGrid {
	public static void main(String[] args) {

		Frame f = new Frame("Button Grid");
		// Set layout to Grid
		f.setLayout(new GridLayout(3, 2));
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		f.pack();
		f.setVisible(true);
	}

}
