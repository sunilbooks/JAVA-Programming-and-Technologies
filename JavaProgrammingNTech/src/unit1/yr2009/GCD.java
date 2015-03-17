package unit1.yr2009;

/**
 * Program receives two numbers from command prompt and find Greatest Common
 * Divisor.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class GCD {

	public static void main(String[] args) throws Exception {

		// Get two numbers from command prompt
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		findGCDByIteration(num1, num2);

		findGCDByRecursion(num1, num2);

	}

	/**
	 * Find GCD by Iteration approach
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void findGCDByIteration(int num1, int num2) {
		int c = num1 % num2;
		while (c != 0) {
			num1 = num2;
			num2 = c;
			c = num1 % num2;
		}
		System.out.println("GCD is :" + num2);
	}

	/**
	 * Find GCD by Recursion approach
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void findGCDByRecursion(int num1, int num2) {
		int c = num1 % num2;
		if (c == 0) {
			System.out.println("GCD is :" + num2);
		} else {
			num1 = num2;
			num2 = c;
			findGCDByRecursion(num1, num2);
		}
	}

}
