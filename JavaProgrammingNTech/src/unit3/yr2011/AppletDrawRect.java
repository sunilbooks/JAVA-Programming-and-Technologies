package unit3.yr2011;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Write a program using paint() method and draw a rectangle on Java Applet
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class AppletDrawRect extends Applet {

	@Override
	public void init() {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void start() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void paint(Graphics g) {
		// Draw a rectangle
		g.drawRect(5, 5, 50, 40);
	}

}
