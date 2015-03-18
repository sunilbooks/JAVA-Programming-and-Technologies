package unit4.yr2013;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Using java database connectivity create a table requirements with fluids
 * department name, post vacant and no. of post .Use appropriate method to
 * insert and enter data.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class DepartmentService {

	private String dbURL = "jdbc:mysql://localhost:3306/company";
	private String login = "scott";
	private String password = "tiger";

	// Create table
	public void createTable() throws Exception {
		// Create Connection
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(dbURL, login, password);
		String sql = "CREATE TABLE DEPARTMENT ( "
				+ "DEPARTMENT_NAME varchar(55) default NULL,"
				+ "NO_OF_POST INT(15) DEFAULT NULL, "
				+ "POST_VACANT int(15) default NULL )";
		Statement statement = conn.createStatement();
		// Execute Query
		statement.executeUpdate(sql);
		System.out.println("Table created.");
		statement.close();
		conn.close();
	}

	// Insert a record
	public void add(String deptName, int noOfPost, int postVacant)
			throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection(dbURL, login, password);
		PreparedStatement stmt = conn
				.prepareStatement("INSERT INTO 	DEPARTMENT(DEPARTMENT_NAME,NO_OF_POST, 	POST_VACANT) VALUES(?,?,?)");
		stmt.setString(1, deptName);
		stmt.setInt(2, noOfPost);
		stmt.setInt(3, postVacant);
		int i = stmt.executeUpdate();
		System.out.println("Added successfull");
		stmt.close();
		conn.close();
	}

	// Test the program
	public static void main(String[] args) throws Exception {
		DepartmentService d = new DepartmentService();
		d.createTable();
		d.add("HR", 100, 25);
	}

}
