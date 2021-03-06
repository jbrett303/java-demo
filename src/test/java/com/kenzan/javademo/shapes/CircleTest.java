package com.kenzan.javademo.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

	@Test
	void getArea() {
		Circle circle = new Circle("Horacio", 5);
		double area = circle.getArea();
		assertEquals(78.53981633974483, area);
	}

	@Test
	void getQuantity() {
		int base = Circle.getQuantity();
		new Circle("Julia",5);
		assertEquals(base + 1, Circle.getQuantity());
		new Circle("Wanda", 5);
		assertEquals(base + 2, Circle.getQuantity());
	}
}