package unit5.yr2009;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {

		// creates a collection
		Collection c = new ArrayList();

		// Add elements into Collection
		c.add("Bura mat Dekho");// Index# 0
		c.add("Bura mat Suno");// Index# 1
		c.add("Bura mat Kaho");// Index# 2

		System.out.println("Length Of Collection:" + c.size());

		// Print all elements of Collection
		for (Object ele : c) {
			System.out.println(ele);
		}

		// Convert collection into array
		Object[] oArray = c.toArray();

		// Print all elements of array
		for (Object ele : oArray) {
			String s = (String) ele;
			System.out.println(s);
		}
	}
}
