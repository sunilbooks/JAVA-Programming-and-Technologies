package unit3.yr2011;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write an application to add two numbers using AWT component (Button, textbox
 * etc.)
 * 
 * Program accepts two numbers from UI and sum them
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class SumNum extends Frame implements ActionListener {

	TextField num1 = new TextField();
	TextField num2 = new TextField();
	TextField sum = new TextField();
	Button goButton = new Button("Go");

	// Create UI
	public SumNum() {

		setLayout(new FlowLayout());

		// Add button listener
		goButton.addActionListener(this);

		// Add components to UI
		add(num1);
		add(new Label("+"));
		add(num2);
		add(new Label("="));
		add(sum);
		add(goButton);
		pack();
	}

	// On Button Click calculate Sum
	public void actionPerformed(ActionEvent arg0) {
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		sum.setText("" + (n1 + n2));
	}

	// Start Window
	public static void main(String[] args) {
		SumNum calc = new SumNum();
		calc.setVisible(true);
	}
}
