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
		HashSet rollNums = new HashSet();

		// Addd Elements
		rollNums.add("One");
		rollNums.add("Two");
		rollNums.add("Three");

		// Get Iterator and print all elements of Set
		Iterator it = rollNums.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
