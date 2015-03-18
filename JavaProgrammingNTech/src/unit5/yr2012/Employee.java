package unit5.yr2012;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Write an employee class in which pay() is a method which calculate the gross
 * pay from basic pay . Write an application which runs this method remotely
 * using RMI
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class Employee extends UnicastRemoteObject implements EmployeeInt {

	private int basic = 0;
	private int hra = 0;
	private int medical = 0;

	public Employee(int b, int h, int m) throws RemoteException {
		basic = b;
		hra = h;
		medical = m;
	}

	public int pay() throws RemoteException {
		int sal = basic + hra + medical;
		return sal;
	}

	public static void main(String[] args) throws Exception {
		// Set the security manager
		System.setSecurityManager(new RMISecurityManager());

		// Create a local instance of the server //object
		EmployeeInt server = new Employee(10000, 4000, 1250);

		// Bind server instance with RMI //Registry
		Naming.rebind("EMP-SERVER", server);

		System.out.println("Server is started");
	}
}
