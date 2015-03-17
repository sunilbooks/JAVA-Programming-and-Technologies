import java.io.RandomAccessFile;

//JAVABean contains Student's Information
class StudentInfo {
	public String rollNo;
	public String name;
	public int marks;
}

// Class has methods to process Student's record and update.
public class StudentUpdateRAF {

	public static void main(String[] args) throws Exception {
		StudentInfo info = new StudentInfo();
		info.rollNo = "A1";
		info.name = "Vijay Chohan";
		info.marks = 99;

		updateInfo(info);

	}

	// Method updates Students Information
	public static void updateInfo(StudentInfo info) throws Exception {

		RandomAccessFile in = new RandomAccessFile("student.dat", "rw");

		// Go to Students record
		in.seek(100);

		// Update Roll No.
		in.writeChars(info.rollNo);

		// Update Name
		in.writeChars(info.name);

		// Update Marks
		in.writeInt(info.marks);

		// Close the file
		in.close();

	}
}
