import java.applet.Applet;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//Applet to display Web Page Visits
public class VisitCountApplet extends Applet {

	// Initialize Applet by Labe that will contain a counter 
	public void init() {

		Label counterLabel = new Label("Counter ");

		try {
			//Connect to server servlet to get counter
			URL u = new URL("http://localhost:8080/App/Counter");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(u.openStream()));
			String count = in.readLine();
			
			//Display server count in Label
			counterLabel.setText("Visits : " + count);

		} catch (Exception e) {
		}

		this.add(counterLabel);
	}
}
