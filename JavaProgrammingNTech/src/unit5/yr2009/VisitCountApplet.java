package unit5.yr2009;

import java.applet.Applet;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Write an applet to show the number of visits made to a web page. The count
 * should be stored on a server side in a file. Every time a page is visited the
 * applet should send a request to the server and the server should increase the
 * count and send that count to the applet. The applet should then display the
 * count in a message.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

// Applet to display Web Page Visits
public class VisitCountApplet extends Applet {

	// Initialize Applet by Label that will contain a counter
	public void init() {

		Label counterLabel = new Label("Counter ");
		try {
			// Connect to server servlet to get counter
			URL u = new URL("http://localhost:8080/App/Counter");
			BufferedReader in = new BufferedReader(new InputStreamReader(
					u.openStream()));

			// Get visit count from server
			String count = in.readLine();

			// Display server count in Label
			counterLabel.setText("Visits : " + count);

		} catch (Exception e) {
		}
		
		// Add label to Applet
		this.add(counterLabel);
	}
}
