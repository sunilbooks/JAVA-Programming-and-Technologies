import java.io.*;

//Program reads line by line from Keyboard and Write to a text file
public class CopyConCommand {

	public static void main(String[] args) throws Exception {

		// Open a Text file to write data
		FileWriter writer = new FileWriter("c:/temp.txt");

		// Make BufferedWriter class object to write data Line by Line
		BufferedWriter out = new BufferedWriter(writer);

		// Read Data from Keyboard Chat by Char
		InputStreamReader isReader = new InputStreamReader(System.in);

		// Read Data from Keyboard line by line
		BufferedReader in = new BufferedReader(isReader);

		// Read first Line from Keyboard
		String line = in.readLine();

		// If line is quit then stop reading data and close text file
		while (!line.equals("quit")) {
			//Write line to File
			out.write(line + "\n");
			
			//Read next line from Keyboard
			line = in.readLine();
		}

		// Close file
		out.close();
		isReader.close();

	}

}
