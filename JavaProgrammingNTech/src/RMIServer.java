import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class AddServerImpl extends UnicastRemoteObject implements AddServerIntf {
	AddServerImpl() throws RemoteException {
		super();
	}

	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

	public static void main(String args[]) throws Exception {
		// set the security manager
		System.setSecurityManager(new RMISecurityManager());

		// create a local instance of the server object
		AddServerImpl Server = new AddServerImpl();

		// Bind server instance with RMI Registry
		Naming.rebind("ADD-SERVER", Server);

		System.out.println("Server is waiting.....");
	}

}

class AddClient {
	public static void main(String[] args) {

		// set the security manager for the client
		System.setSecurityManager(new RMISecurityManager());

		// get the remote object from the registry
		try {
			String url = "rmi://localhost:1099/ADD-SERVER";
			AddServerIntf remoteObject = (AddServerIntf) Naming.lookup(url);
			System.out.println(" SUM = " + remoteObject.sum(1, 2));

		} catch (RemoteException exc) {
			System.out.println("Error in lookup: " + exc.toString());
		} catch (java.net.MalformedURLException exc) {
			System.out.println("Malformed URL: " + exc.toString());
		} catch (java.rmi.NotBoundException exc) {
			System.out.println("NotBound: " + exc.toString());
		}
	}

}

interface AddServerIntf extends Remote {
	public int sum(int a, int b) throws RemoteException;
}
