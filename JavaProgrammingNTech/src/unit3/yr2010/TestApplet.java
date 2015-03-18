package unit3.yr2010;

import java.applet.Applet;

/**
 * Test Applet program
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

class TestApplet extends Applet {

	public void init() {
		System.out.println("This is init");
	}

	public void start() {
		System.out.println("This is Start");
	}

	public void stop() {
		System.out.println("This is Stop");
	}

	public void destroy() {
		System.out.println("This is Destroy");
	}
}
