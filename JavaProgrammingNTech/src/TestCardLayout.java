import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;

public class TestCardLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Frame frame = new Frame("Card Layout Title");
		CardLayout cardLayout = new CardLayout();
		frame.setLayout(cardLayout);
		cardLayout.show(frame, "Fruits");

	}

}
