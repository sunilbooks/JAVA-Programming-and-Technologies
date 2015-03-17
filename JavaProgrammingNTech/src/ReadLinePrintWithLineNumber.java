import java.io.FileReader;
import java.io.LineNumberReader;

public class ReadLinePrintWithLineNumber {

	public static void main(String[] args) throws Exception {

		///Open a File
		FileReader file = new FileReader("c:/user.js");
		
		//Open reader to read line and line number
		LineNumberReader in = new LineNumberReader(file);

		//Read Line
		String line = in.readLine();
		
		//Read Line 
		int lineNo = in.getLineNumber();

		//Print line until line is NULL
		while (line != null) {
			System.out.println(lineNo + ":" + line);
			line = in.readLine();
			lineNo = in.getLineNumber();
		}

		//Close File
		file.close();
		in.close();

	}
}
