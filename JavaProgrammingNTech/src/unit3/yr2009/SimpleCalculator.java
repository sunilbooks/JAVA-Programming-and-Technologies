package unit3.yr2009;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a program to simulate a simple calculator using AWT.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class SimpleCalculator extends Frame implements ActionListener {

	TextField num1 = new TextField();
	TextField num2 = new TextField();
	TextField sum = new TextField();

	Button goButton = new Button("Go");

	/**
	 * Build Calculate screen
	 */
	public SimpleCalculator() {
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

	/**
	 * Calculate sum on button click
	 */
	public void actionPerformed(ActionEvent arg0) {
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		sum.setText("" + (n1 + n2));
	}

	/**
	 * Start calculator
	 */
	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		calc.setVisible(true);
	}
}
