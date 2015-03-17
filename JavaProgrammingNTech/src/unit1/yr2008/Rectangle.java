package unit1.yr2008;

/**
 * Child class Rectangle overrides area() method to provide specialised
 * behaviour
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

class Rectangle extends Shape {
	int length = 0;
	int width = 0;

	public double area() {
		return length * width;
	}
}
