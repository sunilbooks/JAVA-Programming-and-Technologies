import java.io.FileReader;

public class FileCount {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader(args[0]);

		int c = 0, w = 0, l = 0;
		
		int ch = reader.read();
		char chr;
		while (ch != -1) {
			chr = (char) ch;
			c++;// Increase Character 
			if ((chr == ' ') || (chr == '\n')) {
				w++; //Increase Word Count
			}
			if (chr == '\n') {
				l++; //Increase Line
			}
			ch = reader.read();
		}

		System.out.println("No of Characters in File=" + c);
		System.out.println("No of Words in File=" + w);
		System.out.println("No of Lines in File =" + l);

	}

}
