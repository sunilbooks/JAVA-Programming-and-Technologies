import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.ScrollPane;

import javax.swing.JButton;

public class AWTComponent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame frame = new Frame("Scroll List");

		List l = new List(3);
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");

		ScrollPane pan = new ScrollPane();
		pan.add(l);

		frame.add(pan);
		frame.pack();
		frame.setVisible(true);

	}

	public static void createFrame() {
		Frame frame = new Frame("Hello Window");
		frame.setLayout(new FlowLayout());
		Button b = new Button("Click Me");

		frame.add(b);
		frame.setSize(600,400);
		frame.setVisible(true);

	}

}
