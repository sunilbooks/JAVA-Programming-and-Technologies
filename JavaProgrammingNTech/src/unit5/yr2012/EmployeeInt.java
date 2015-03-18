package unit5.yr2012;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Write an employee class in which pay() is a method which calculate the gross
 * pay from basic pay . Write an application which runs this method remotely
 * using RMI
 * 
 * Remote Interface of Employee
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public interface EmployeeInt extends Remote {
	public int pay() throws RemoteException;
}
