package unit2.yr2010;

/**
 * Write a class whose objects hold a current value and have a method to add to
 * that value, printing the new value. Write a program that creates such an
 * object creates multiple threads and invokes the adding method repeatedly from
 * each thread. Write the class such that no addition can be lost.
 * 
 * Creates Multiple Threads to add value to DataHolder object concurrently
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class AddThread extends Thread {

	// Static makes single instance, accessed by concurrent threads
	static DataValue data = new DataValue();

	/**
	 * Add to data
	 */
	public void run() {
		for (int i = 0; i < 5; i++) {
			data.add(10);
		}
	}

	public static void main(String[] args) {

		// Create multiple threads to add value to Data object.
		for (int i = 0; i < 10; i++) {
			AddThread t = new AddThread();
			t.start();
		}

	}
}

/**
 * Holds the current value. Has method to add and print a new value
 */
class DataValue {

	int data = 0;

	/**
	 * Adds a Value. It is synchronized to handle concurrent add.
	 * 
	 * @param val
	 */
	synchronized public void add(int val) {
		data += val;
		System.out.println("New value is " + data);
	}
}
