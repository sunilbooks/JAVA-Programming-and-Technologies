package unit1.yr2012;

/**
 * Copy Constructors provide an attractive alternative to the clone method. They
 * can be easily implemented. It simply extracts the argument's data, and
 * forward to a regular constructor. They are not used in immutable object.
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

public class Robot {

	private String cpu = null;
	private String speed = null;

	// A normal parameterized constructor
	public Robot(String cpu, String speed) {
		this.cpu = cpu;
		this.speed = speed;
	}

	// copy constructor
	public Robot(Robot robo) {
		this.cpu = robo.cpu;
		this.speed = robo.speed;
	}

	// Overriding the toString of Object class
	public String toString() {
		return "Robo CPU: " + cpu + " Speed:" + speed;
	}

	public static void main(String[] args) {

		Robot robo1 = new Robot("Chitti", "400GHz");

		// Copy constructor call
		Robot robo2 = new Robot(robo1);

		System.out.println("1:" +robo1);
		System.out.println("2:" +robo2);
	}

}
