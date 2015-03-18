package unit5.yr2009;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

class AddClient {

	public static void main(String[] args) {
		// set the security manager for the client
		System.setSecurityManager(new RMISecurityManager());

		// get the remote object from the //registry
		try {
			String url = "rmi://localhost:1099/ADD-SERVER";
			AddServerIntf remoteObj = (AddServerIntf) Naming.lookup(url);
			System.out.println("Sum : " + remoteObj.sum(1, 2));
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
	}
}
