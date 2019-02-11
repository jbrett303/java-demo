package com.kenzan.javademo.shapes;

public abstract class Shapes implements  Comparable<Shapes>{

	public String name;
	public double area;
	public double perimeter;

	static int quantity;

	/**
	 * Throws exception when a shape name is submitted that is already in use.
	 * @param name string, the name of a shape
	 * @throws IllegalArgumentException 
	 */
	protected static void checkIfNameExists(String name){
		if (ShapeStore.getShapeByName(name) == null){
			return;
		}else throw new IllegalArgumentException(
				"Name: " + name + " already exists.  " +
						"Shapes, like snowflakes are unique, " +
						"except when their not so they might as well have unique names"
		);
	}

	/**
	 * Increments the static Shapes quantity field.  All subclassed shapes should increment this in their constructor.
	 */
	static void incrementQty(){
		 quantity++;
	}

	/**
	 * @return quantity of instatiated shapes in the app
	 */
	public static int getQuantity(){
		return quantity;
	}

	@Override
	public String toString(){
		return this.getClass().getSimpleName()
				+ ", named "
				+ this.name
				+ ", with an area of "
				+ this.area
				+ " inches, a perimeter of  "
				+ this.perimeter
				+ " square inches";
	}

	@Override
	public int compareTo(Shapes shape){
		return this.name.compareTo(shape.name);
	}

}
