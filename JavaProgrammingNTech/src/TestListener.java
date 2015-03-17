import java.awt.Button;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestListener {

	public static void main(String[] args) {
		Frame frame = new Frame("Simple Menu");

		Button button = new Button("Click Me");
		// Create Listener Object
		SimpleButtonHandler bHandler = new SimpleButtonHandler();
		// Register Listener
		button.addActionListener(bHandler);
		frame.add(button);
		frame.setSize(600, 400);
		frame.setVisible(true);

	}

}

class SimpleButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("Button is Clicked");
	}
}
