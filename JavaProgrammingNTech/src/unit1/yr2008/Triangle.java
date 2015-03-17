package unit1.yr2008;

/**
 * Child class Triangle overrides area() method to provide specialised behaviour
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

class Triangle extends Shape {
	int base = 0;
	int height = 0;

	public double area() {
		return 1 / 2 * base * height;
	}
}
