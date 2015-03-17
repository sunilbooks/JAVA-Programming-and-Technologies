import java.io.*;

//A Text File and after removing vowels copy to another Text 
// file in same directory
public class RemoveVowelsAndCopyFile {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("in.txt");
		BufferedReader in = new BufferedReader(reader);

		FileWriter writer = new FileWriter("out.txt");
		PrintWriter out = new PrintWriter(writer);

		String line = in.readLine();

		while (line != null) {
			// Remove Vowels
			line = line.replaceAll("[aeiou]", "");

			// Write to new Text File
			out.println(line);

			// Read New Line
			line = in.readLine();
		}

		//Close Files 
		reader.close();
		in.close();
		writer.close();
		out.close();
	}
}
