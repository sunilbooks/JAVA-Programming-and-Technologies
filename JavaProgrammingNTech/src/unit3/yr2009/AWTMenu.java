package unit3.yr2009;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 * Write a program example Menu in AWT.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
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
