package unit5.yr2009;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 * Write an employee class in which pay() is a method which calculate the gross
 * pay from basic pay . Write an application which runs this method remotely
 * using RMI
 * 
 * Employee remote Client
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class EmployeeClient {
	public static void main(String[] args) throws Exception {

		// set the security manager for the client
		System.setSecurityManager(new RMISecurityManager());

		// Get the Employee server object from the //registry
		try {
			// URL of Employee Server Object
			String url = "rmi://localhost:1099/EMP-SERVER";

			// Lookup Employee Object
			EmployeeInt emp = (EmployeeInt) Naming.lookup(url);

			// Call pay method
			System.out.println("Employee Salary " + emp.pay());

		} catch (Exception exc) {
			System.out.println("RMI Call Error");
		}
	}

}
