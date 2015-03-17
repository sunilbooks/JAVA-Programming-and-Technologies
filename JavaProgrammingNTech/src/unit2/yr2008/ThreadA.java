package unit2.yr2008;

/**
 * A program to create a thread “A”, which creates two child threads “B” and
 * “C”. “A” must terminate after both “B” and “C” have terminated.
 * 
 * “B” and “C” must print their own names 100 times and then terminate.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */
public class ThreadA extends Thread {

	public void run() {

		// Create B & C Threads
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();

		// Start Threads
		b.start();
		c.start();

		// Join B & C threads and wait until both are finished.
		try {

			b.join();
			c.join();

		} catch (InterruptedException e) {
		}

		System.out.println("Thread A is finished");
	}

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.start();
	}
}

/**
 * Thread B prints its name 100 times
 */
class ThreadB extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread B");
		}
	}
}

/**
 * Thread C prints its name 100 times
 */
class ThreadC extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread C");
		}
	}
}
