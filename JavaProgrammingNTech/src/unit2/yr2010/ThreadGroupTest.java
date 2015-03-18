package unit2.yr2010;

/**
 * Test program of Thread Group.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class ThreadGroupTest {

	public static void main(String[] args) {

		ThreadGroup team = new ThreadGroup("Team India");

		Player p1 = new Player(team, "Dhoni");
		Player p2 = new Player(team, "Kohli");
		p1.start();
		p2.start();

		System.out.println("TG Name :" + team.getName());
		System.out.println("Running Threads: " + team.activeCount());
		System.out.println("Max TG Priority:" + team.getMaxPriority());
		System.out.println("Active TG:" + team.activeGroupCount());
		System.out.println("Parent TG:" + team.getParent());
	}
}

/**
 * Player Thread
 * 
 * @author sunil.sahu
 * 
 */
class Player extends Thread {

	public Player(ThreadGroup tg, String name) {
		super(tg, name);
	}

	public void run() {
		for (int matches = 1; matches < 10; matches++) {
			System.out.println(this.getName() + " played match # " + matches);
		}
	}
}
