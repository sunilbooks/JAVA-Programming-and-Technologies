import java.awt.*;

public class AWTMenu {

	public static void main(String[] args) {

		Frame frame = new Frame("Simple Menu");

		// First Menu
		Menu menu = new Menu("File");
		MenuItem newMenuItem = new MenuItem("New");
		MenuItem exitMenuItem = new MenuItem("Exit");

		menu.add(newMenuItem);
		menu.add(exitMenuItem);

		// MenuBar
		MenuBar menuBar = new MenuBar();
		menuBar.add(menu);

		frame.setMenuBar(menuBar);
		frame.setSize(600, 400);
		frame.setVisible(true);

	}
}
