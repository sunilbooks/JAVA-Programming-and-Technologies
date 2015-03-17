import java.util.HashSet;
import java.util.Iterator;

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

		//Get Iterator and print all elements of Set
		Iterator it = rollNums.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
