import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;



//Class extends MouseAdapter to become Listner of Mouse
public class MouseClickEvent extends MouseAdapter {

	//Handles Mouse Click event. Displays message at console when mouse is clicked
	public void mouseClicked(MouseEvent eve) {
		System.out.println("Button is Clicked by Mouse");
	}

	//Displays Window with a button. 
	public static void main(String[] args) {

		// Create a Window
		Frame frame = new Frame("Scroll List");
		// Create a Button
		Button b = new Button("Click Me");

		// Create Listner Object that will handle Mouse Click event
		MouseClickEvent eventHandler = new MouseClickEvent();

		// Add Listner with Button
		b.addMouseListener(eventHandler);

		// Place Button at Window
		frame.add(b);
		frame.pack();

		// Display Window
		frame.setVisible(true);

	}
}
