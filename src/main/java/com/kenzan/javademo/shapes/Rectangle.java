package com.kenzan.javademo.shapes;

public class Rectangle extends Shapes implements flatShape {

	private static int quantity;

	double length;
	double width;

	/**
	 * Rectangle did you know that all squares are rectangles, but not all rectangles are squares?  I did.
	 * @param length of one side of rectangle
	 * @param width of the other side of rectangle
	 */
	public Rectangle(String name, double length, double width){
		super.checkIfNameExists(name);
		this.length = length;
		this.width = width;
		this.name = name;
		this.area = length * width;
		this.perimeter = (length + width) * 2;
		ShapeStore.storeShape(this);
		super.incrementQty();
		quantity++;
	}

	/**
	 * getArea will return the area of the rectangle in whatever dimension type it was instantiated with.
	 * @return the area of the rectangle
	 */
	public double getArea(){
		return super.area;
	}

	/**
	 * getQuantity returns the quantity of instantiated rectangles in the app
	 * @return int representing the amount of instantiated rectangles (in this app) not like, everywhere.
	 */
	public static int getQuantity(){
		return quantity;
	}
}
