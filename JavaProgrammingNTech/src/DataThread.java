//Create Multiple Threads to add value to DataHolder object concurrenlty 
public class DataThread {

	public static void main(String[] args) {

		DataObject data = new DataObject(5);

		// Create multiple threads to add value in same object
		for (int i = 0; i < 100; i++) {
			AddThread t = new AddThread(data);
			t.start();
		}

	}

}

// Thread that will add value to DataObject
class AddThread extends Thread {
	DataObject dataObj = null;

	// Pass Data Object
	public AddThread(DataObject d) {
		dataObj = d;
	}

	// Add value 10 to data object
	public void run() {
		dataObj.add(10);
	}
}

// An Object hold a value and add given number
class DataObject {
	int data = 0;

	// Hold a Value
	public DataObject(int val) {
		data = val;
	}

	// Add a Value. Make it syncronized so that concurrent Threads added value
	// can not be lost
	synchronized public void add(int val) {
		data += val;
		System.out.println("New value is " + data);
	}
}
