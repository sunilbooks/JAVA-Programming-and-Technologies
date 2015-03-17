package unit1.yr2008;

/**
 * Child class Circle overrides area() method to provide specialised behaviour
 * 
 * @version 1.0
 * @since 17 Mar 2015
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 * 
 */

class Circle extends Shape {
	double radius = 0;

	public double area() {
		return 3.14 * radius * radius;
	}
}
