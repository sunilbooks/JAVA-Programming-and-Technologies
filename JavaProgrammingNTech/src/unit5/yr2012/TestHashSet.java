package unit5.yr2012;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Use of HashSet.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class TestHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate Set
		HashSet nums = new HashSet();

		// Addd Elements
		nums.add("One");
		nums.add("Two");
		nums.add("Three");

		// Get Iterator and print all elements of Set
		Iterator it = nums.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
