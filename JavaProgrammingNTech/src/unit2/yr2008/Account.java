package unit2.yr2008;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Account {

	private int balance = 0;

	public synchronized void deposit(String msg, int amt) {

		// public void deposit(String message, int amount) {

		int bal = 0;

		// synchronized (this){
		bal = getBalance() + amt;
		setBalance(bal);
		// }

		System.out.println(msg + " Now Balance is " + bal);

	}

	public int getBalance() {
		try {
			Thread.sleep(200); // Simulate Database Operation
		} catch (InterruptedException e) {
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);// Simulate Database Operation
		} catch (InterruptedException e) {
		}
		this.balance = balance;
	}

}
