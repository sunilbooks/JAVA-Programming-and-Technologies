package unit1.yr2012;

import java.util.Scanner;

/**
 * A program in java to accept a positive integer from the user and print
 * whether it is a Fibonacci number or not.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter a number :");
		int number = new Scanner(System.in).nextInt();

		int prev, next, sum, num;
		prev = next = 1;

		while (true) {
			// Check if next Fibonacci number is greater than or equal to
			// entered number
			if (next >= number) {
				if (next == number) {
					System.out.println(number + " is Fibonacci ");
				} else {
					System.out.println(number + " is not a Fibonacci ");
				}
				break;
			}
			sum = prev + next;
			prev = next;
			next = sum;
		}

	}
}
