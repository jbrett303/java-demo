package com.circlesandrandommaths.demo;

import static java.lang.Math.PI;

public class Circle extends Shapes implements flatShape {

	private static int quantity;

	double radius;

	/**
	 * circles are round, so round.  They've been used to visualize infinity, but that also says everything repeats.
	 * circles are round, so round.  They've been used to visualize infinity, but that also says everything repeats.
	 * @param radius of the circle
	 */
	public Circle(String name, double radius){
		super.checkIfNameExists(name);
		this.radius = radius;
		super.area = PI * (radius * radius);
		super.perimeter = PI * (radius + radius);
		super.name = name;
		ShapeStore.storeShape(this);
		super.incrementQty();
		quantity++;
	}


	/**
	 * getArea will return the area of the circle in whatever dimension type it was instantiated with.
	 * @return the area of the circle
	 */
	public double getArea(){
		return super.area;
	}

	/**
	 * getQuantity returns the quantity of instantiated circles in the app
	 * @return int representing the amount of instantiated circles
	 */
	public static int getQuantity(){
		return quantity;
	}

}
