package unit5.yr2009;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerIntf extends Remote {
	public int sum(int a, int b) throws RemoteException;
}
