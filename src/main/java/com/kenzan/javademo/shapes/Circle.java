package com.kenzan.javademo.shapes;

import static java.lang.Math.PI;

public class Circle extends Shapes implements flatShape {

	private static int quantity;

	public double radius;

	/**
	 * circles are round, so round. They've been used to visualize infinity, but
	 * that also says everything repeats. circles are round, so round. They've been
	 * used to visualize infinity, but that also says everything repeats.
	 * @param radius of the circle
	 * @param name of this particular circle.  Names are enforced unique across all shapes.
	 */
	public Circle(String name, double radius) {
		super.checkIfNameExists(name);
		this.radius = radius;
		this.area = PI * (radius * radius);
		this.perimeter = PI * (radius + radius);
		this.name = name;
		ShapeStore.storeShape(this);
		super.incrementQty();
		quantity++;
	}

	/**
	 * Deprecated method.  We're pretty sure circles are all magic.  The science disagrees 
	 * but we like pascal will say they're magic just in case.
	 * @return true
	 */
	@Deprecated
	public boolean isMagic() {
		return true;
	}

	/**
	 * getArea will return the area of the circle in whatever dimension type it was
	 * instantiated with.
	 * @return the area of the circle
	 */
	public double getArea() {
		return super.area;
	}

	/**
	 * getQuantity returns the quantity of instantiated circles in the app
	 * @return int representing the amount of instantiated circles
	 */
	public static int getQuantity() {
		return quantity;
	}

}
