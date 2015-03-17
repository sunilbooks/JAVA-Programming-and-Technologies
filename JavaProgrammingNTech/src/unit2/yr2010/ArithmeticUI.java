package unit2.yr2010;

import java.awt.*;
import java.awt.event.*;

public class ArithmeticUI extends Frame implements ActionListener {

	Label num1Label = new Label("Enter Num#1");
	Label num2Label = new Label("Enter Num#2");

	// Nume and Num 2
	TextField num1 = new TextField();
	TextField num2 = new TextField();

	// result to keep result
	TextField result = new TextField();

	// Four buttons
	Button addButton = new Button("Add");
	Button subtractButton = new Button("Subtract");
	Button multiplyButton = new Button("Multiply");
	Button divideButton = new Button("Divide");

	// Menu to Hold Operations
	Menu menu = new Menu("Arithmetic");
	MenuItem addMenuItem = new MenuItem("Add");
	MenuItem subtractMenuItem = new MenuItem("Subtract");
	MenuItem multiplyMenuItem = new MenuItem("Multiply");
	MenuItem divideMenuItem = new MenuItem("Divide");

	public ArithmeticUI() {

		this.setLayout(new FlowLayout());

		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);

		addMenuItem.addActionListener(this);
		subtractMenuItem.addActionListener(this);
		multiplyMenuItem.addActionListener(this);
		divideMenuItem.addActionListener(this);

		menu.add(addMenuItem);
		menu.add(subtractMenuItem);
		menu.add(multiplyMenuItem);
		menu.add(divideMenuItem);

		MenuBar menuBar = new MenuBar();
		menuBar.add(menu);
		setMenuBar(menuBar);

		add(num1Label);
		add(num1);

		add(num2Label);
		add(num2);
		add(result);

		add(addButton);
		add(subtractButton);
		add(multiplyButton);
		add(divideButton);

	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		String label = null;
		if (ev.getSource() instanceof MenuItem) {
			MenuItem mi = (MenuItem) ev.getSource();
			label = mi.getLabel();
		} else {
			Button b = (Button) ev.getSource();
			label = b.getLabel();
		}
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());

		if (label.equals("Add")) {
			result.setText(String.valueOf(n1 + n2));
		} else if (label.equals("Subtract")) {
			result.setText(String.valueOf(n1 - n2));
		} else if (label.equals("Multiply")) {
			result.setText(String.valueOf(n1 * n2));
		} else if (label.equals("Divide")) {
			result.setText(String.valueOf(n1 / n2));
		}

	}

	public static void main(String[] args) {

		ArithmeticUI win = new ArithmeticUI();
		win.pack();
		win.setVisible(true);

	}
}
