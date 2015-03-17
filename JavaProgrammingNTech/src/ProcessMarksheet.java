import java.sql.*;

//Class contains Marksheet Data
class MarksheetData {
	public String rollNo;
	public String name;
	public int marks;
}

// Class process add, delete, update and get operations of Marksheet
public class ProcessMarksheet {

	// Connection to Database
	Connection conn = null;

	// Statement to execute SQLs
	PreparedStatement stmt = null;

	// Default Constructor
	public ProcessMarksheet() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// Make connection to database
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/test", "root", "root");
	}

	// Get a Marksheet for given Roll NO from Database
	public MarksheetData getMarkSheet(String rollNo) throws Exception {

		stmt = conn.prepareStatement("select * from Marksheet where rollNo=?");
		stmt.setString(1, rollNo);
		ResultSet rs = stmt.executeQuery();

		MarksheetData marksheetDTO = null;
		if (rs.next()) {
			marksheetDTO = new MarksheetData();
			marksheetDTO.rollNo = rs.getString(1);
			marksheetDTO.name = rs.getString(2);
			marksheetDTO.marks = rs.getInt(3);
		}
		stmt.close();
		return marksheetDTO;
	}

	// Add a Marksheet into Database
	public int addMarkSheet(MarksheetData dto) throws Exception {

		stmt = conn.prepareStatement("insert into Marksheet value (?,?,?,? )");
		stmt.setString(1, dto.rollNo);
		stmt.setString(2, dto.name);
		stmt.setInt(3, dto.marks);
		int i = stmt.executeUpdate();
		stmt.close();
		return i;
	}

	// Update a Marksheet
	public int updateMarkSheet(MarksheetData dto) throws Exception {
		stmt = conn
				.prepareStatement("update Marksheet set name=?, marks=? where rollNo=?");
		stmt.setString(1, dto.name);
		stmt.setInt(2, dto.marks);
		stmt.setString(3, dto.rollNo);
		int i = stmt.executeUpdate();
		stmt.close();
		return i;
	}

	// Delete a Marksheet of given
	public int deleteMarkSheet(String rollNo) throws Exception {

		stmt = conn.prepareStatement("delete Marksheet where rollNo=?");
		stmt.setString(1, rollNo);
		int i = stmt.executeUpdate();
		stmt.close();
		return i;
	}

	// Close Database connection when Object is destroyed
	protected void finalize() throws Exception {
		conn.close();
	}

}
