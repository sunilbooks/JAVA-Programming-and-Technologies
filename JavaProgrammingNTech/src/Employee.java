import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 * Employee RMI Server Remote Interface
 */
interface EmployeeInt extends Remote {
	public int pay() throws RemoteException;
}

/**
 * RMI Employee Server that has pay() method
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
		int sal = basic * hra * medical;
		return sal;
	}

	public static void main(String[] args) throws Exception {
		// Set the security manager
		System.setSecurityManager(new RMISecurityManager());

		// Create a local instance of the server object
		EmployeeInt server = new Employee(10000, 4000, 1250);

		// Bind server instance with RMI Registry
		Naming.rebind("EMP-SERVER", server);

		System.out.println("Server is started");

	}

}

/**
 * Employee RMI Client that calls pay method
 * 
 */
class RMIEmployeeClient {

	public static void main(String[] args) throws Exception {

		// set the security manager for the client
		System.setSecurityManager(new RMISecurityManager());

		// Get the Employee server object from the registry
		try {
			// URL of Employee Server Object
			String url = "rmi://localhost:1099/EMP-SERVER";

			// Lookup Employee Object
			EmployeeInt emp = (EmployeeInt) Naming.lookup(url);

			// Call pay method
			System.out.println(" Employee Salary " + emp.pay());

		} catch (Exception exc) {
			System.out.println("Error in RMI Call ");
		}

	}
}
