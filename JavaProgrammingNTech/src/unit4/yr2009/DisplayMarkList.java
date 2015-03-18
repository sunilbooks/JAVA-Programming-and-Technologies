package unit4.yr2009;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Write a JDBC Program for student Mark list processing.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class DisplayMarkList {

	public static void main(String args[]) throws Exception {
		// Load Driver
		Class.forName("com.mysql.jdbc.Driver");

		// Create Connection
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "login", "pwd");

		Statement stmt = conn.createStatement();

		// Put SQL Query to get Mark list
		ResultSet rs = stmt
				.executeQuery("select rollNo,name,physics,chemistry,maths from Marksheet");

		// Read Marks and print data on Console

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getInt(3));
			System.out.println("\t" + rs.getInt(4));
			System.out.println("\t" + rs.getInt(5));
		}

		// Close Statement and clear buffer
		stmt.close();
		// Close database connection
		conn.close();
	}

}
