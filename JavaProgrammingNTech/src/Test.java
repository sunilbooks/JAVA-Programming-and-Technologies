public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello Java");
	}

	double balance;

	public void fundTransfer(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficiate Balance");
		}

	}

}

class SwitchDemo {
	public static void main(String[] args) {
		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Mondays are bad");
			break;
		case 2:
			System.out.println("Thuesdays are okay");
			break;
		case 3:
			System.out.println("Wednesdays are charged");
			break;
		case 4:
			System.out.println("Thursdays are fully charged");
			break;
		case 5:
			System.out.println("Fridays are better");
			break;
		case 6:
			System.out.println("Saturdays are Good");
			break;
		case 7:
			System.out.println("Sundays are best! ZZZ");
			break;
		default:
			System.out.println("This is fun day Enjoy!");
			;
			break;
		}
	}
}
