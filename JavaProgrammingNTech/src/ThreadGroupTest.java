public class ThreadGroupTest {

	public static void main(String[] args) {

		ThreadGroup team = new ThreadGroup("Team India");

		Player p1 = new Player(team, "MS Dhoni");
		Player p2 = new Player(team, "Yuvraj Singh");
		p1.start();
		p2.start();

		System.out.println("ThreadGroup name is: " + team.getName());
		System.out.println("There are currently " + team.activeCount()
				+ " threads running");
		System.out.println("The maximum priority of a Thread "
				+ team.getMaxPriority());
		System.out.println("There are currently " + team.activeGroupCount()
				+ " active groups");
		System.out.println(team.getName() + " parent is " + team.getParent());

	}

}

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
