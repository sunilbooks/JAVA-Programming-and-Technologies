import java.sql.*;

public class TestMySQLDataBase {

	public static void main(String args[]) throws Exception {
		
		//Load Driver
		Class.forName("com.mysql.jdbc.Driver");

		//Make Connection
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");

		//Create Statement
		Statement stmt = conn.createStatement();
		
		//Execute Query 
		ResultSet rs = stmt.executeQuery("SELECT id, name, color FROM part");

		//Print Results
		System.out.println("ID\tName\tColor");
		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getString(3));
		}
		
		//Close Connection 
		stmt.close();
		conn.close();
	}

}
