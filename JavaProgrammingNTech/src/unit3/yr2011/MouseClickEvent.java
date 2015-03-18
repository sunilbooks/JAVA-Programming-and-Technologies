package unit3.yr2011;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Create a mouse click event on press button.
 * 
 * This program displays a Button ON. When button is clicked, mouse listener
 * toggles it to OFF.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

// Make class mouse listener by extending MouseAdapter
public class MouseClickEvent extends MouseAdapter {

	/**
	 * Toggle On to Off and Off to On
	 */
	public void mouseClicked(MouseEvent eve) {
		Button b = (Button) eve.getSource();
		String text = b.getLabel();
		if ("ON".equals(text)) {
			b.setLabel("ON");
		} else {
			b.setLabel("OFF");
		}
	}

	/**
	 * Displays Window with a button.
	 */
	public static void main(String[] args) {

		// Create a Window
		Frame frame = new Frame("Toggle Win");
		// Create a Button
		Button b = new Button("ON");

		// Create Listener Object that will handle Mouse Click event
		MouseClickEvent mh = new MouseClickEvent();

		// Add Listener with Button
		b.addMouseListener(mh);

		// Place Button at Window
		frame.add(b);
		frame.pack();

		// Display Window
		frame.setVisible(true);

	}
}
