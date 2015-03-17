import java.awt.Graphics;

import javax.swing.JApplet;

//Applet Draw a rectangle on Applet sing Print method
public class AppletDrawRect extends JApplet {

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

}// End HelloApplet class

