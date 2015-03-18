package unit5.yr2012;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

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
