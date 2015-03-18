package unit5.yr2009;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf {

	AddServerImpl() throws RemoteException {
		super();
	}

	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

	public static void main(String args[]) throws Exception {
		// set the security manager
		System.setSecurityManager(new RMISecurityManager());

		// create a local instance of the server //object
		AddServerImpl server = new AddServerImpl();

		// Bind server instance with RMI Registry
		Naming.rebind("ADD-SERVER", server);

		System.out.println("Server is waiting.....");
	}
}
