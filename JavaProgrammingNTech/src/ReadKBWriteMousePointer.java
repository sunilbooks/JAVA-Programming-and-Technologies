import java.awt.*;
import java.io.*;

//Program to read data from Keyboard and Print at Mouse Position
public class ReadKBWriteMousePointer {

	public static void main(String[] args) throws Exception {

		// Read Characters from Keyboard
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(
				System.in));
		String chars = stdIn.readLine();

		// Identify Mouse Pointer Position

		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		System.out.println(x + ":" + y);

		// Display Text at Mouse Location
		Frame f = new Frame();
		f.setLocation(x, y);
		f.add(new Label(chars));
		f.pack();
		f.setVisible(true);
	}

}
