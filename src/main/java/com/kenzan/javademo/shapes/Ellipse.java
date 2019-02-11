package com.kenzan.javademo.shapes;

import static java.lang.Math.PI;

public class Ellipse extends Shapes implements flatShape {

	private static int quantity;

	public double radiusOne;
	public double radiusTwo;

	/**
	 * Ellipse instantiates a squished circle aka ellipse
	 * @param name of this particular ellipse.  Names are enforced unique across all shapes.
	 * @param radiusOne one radius of the ellipse
	 * @param radiusTwo the other radius of the ellipse
	 */
	public Ellipse(String name, double radiusOne, double radiusTwo) {
		super.checkIfNameExists(name);
		this.radiusOne = radiusOne;
		this.radiusTwo = radiusTwo;
		this.name = name;
		this.area = PI * radiusOne * radiusTwo;
		this.perimeter = getPerimeter(radiusOne, radiusTwo);
		ShapeStore.storeShape(this);
		super.incrementQty();
		quantity++;
	}

	/**
	 * getArea will return the area of the ellipse in whatever dimension type it was
	 * instantiated with.
	 * 
	 * @return the area of the ellipse
	 */
	public double getArea() {
		return super.area;
	}

	/**
	 * getQuantity returns the quantity of instantiated ellipses in the app
	 * 
	 * @return int representing the amount of instantiated ellipses
	 */
	public static int getQuantity() {
		return quantity;
	}

	/**
	 * helper function for the constructor
	 * 
	 * @param radiusOne
	 * @param radiusTwo
	 * @return the perimeter/circumference
	 */
	private static double getPerimeter(double radiusOne, double radiusTwo) {
		return PI
				* (3 * (radiusOne + radiusTwo) - Math.sqrt((3 * radiusOne + radiusTwo) * (radiusOne + 3 * radiusTwo)));
	}
}
