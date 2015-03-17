package unit1.yr2012;

public class LabelledContinue {
	public static void main(String args[]) {

		int[] numbers = new int[] { 100, 18, 21, 30 };

		// Outer loop checks if number is multiple of 2
		OUTER: // outer label
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Odd number: " + i
						+ ", continue from OUTER label");
				continue OUTER;
			}
		}
	}
}
