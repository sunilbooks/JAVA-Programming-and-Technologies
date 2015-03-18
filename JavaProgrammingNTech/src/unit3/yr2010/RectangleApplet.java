package unit3.yr2010;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Write an applet that randomly places a specified number of rectangles of
 * random sizes and colors at least partially inside the applet visible area.
 * Read the number of rectangles to be drawn through PARAM tags.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class RectangleApplet extends Applet {

	private Color[] colors = { Color.black, Color.red, Color.blue };

	public void paint(Graphics g) {

		// Number of Rectangles to be drawn
		int noOfRect = Integer.parseInt(getParameter("noOfRect"));

		// Get Random number object
		Random rand = new Random();
		g = getGraphics();

		// Get random number range 0,1,2
		int randomNo = 0;

		// Hight of rectangle
		int height = 10;

		// Width of rectangle
		int width = 10;

		// X Position
		int xPosition = 10;
		// Y Position
		int yPosition = 10;

		for (int i = 0; i < noOfRect; i++) {

			randomNo = rand.nextInt(2);

			// Calculate dynamic postion of rectangle
			xPosition += randomNo * 10;
			yPosition += randomNo * 10;

			// Calculate dynamic height and width of //rectangle
			height += randomNo * 10;
			width += randomNo * 10;
			// Set color of rectangle
			g.setColor(colors[randomNo]);

			// Draw rectangle
			g.fillRect(xPosition, yPosition, width, height);

		}
	}
}
