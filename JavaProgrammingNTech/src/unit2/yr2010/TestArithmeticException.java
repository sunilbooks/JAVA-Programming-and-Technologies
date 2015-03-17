package unit2.yr2010;

public class TestArithmeticException {

	public static void main(String[] args) {
		int k = 0;
		int i = 15;

		try {
			// Divide by Zero and raise an exception
			double div = i / k;
			System.out.println("Div is " + div);

		} catch (ArithmeticException e) {
			// Handle exception and print custom message
			System.out.println("Number can not be divided by ZERO");

		} finally {
			k = 0;
			i = 15;
		}

	}

}
