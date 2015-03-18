package unit3.yr2012;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Prints Hello to Applet
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class HelloApplet extends Applet {
	@Override
	public void paint(Graphics g) {
		g.drawRect(5, 5, 100, 30);
		g.drawString("Hello Applet", 10, 20);
	}
}
