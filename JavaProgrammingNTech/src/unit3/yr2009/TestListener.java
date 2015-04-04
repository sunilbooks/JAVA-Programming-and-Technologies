package unit3.yr2009;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Test program of Listener
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class TestListener {

	public static void main(String[] args) {

		Frame frame = new Frame("Event Window");
		
		Button button = new Button("Click Me");

		// Create Listener Object
		ButtonHandler bHandler = new ButtonHandler();
		// Register Listener
		button.addActionListener(bHandler);

		frame.add(button);
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}

/**
 * Handles click event
 */
class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("Button is Clicked");
	}
}
