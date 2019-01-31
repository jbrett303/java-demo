package com.kenzan.javademo;

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
		Circle circle = new Circle("Julia",5);
		assertEquals(base + 1, Circle.getQuantity());
		Circle circle2 = new Circle("Wanda", 5);
		assertEquals(base + 2, Circle.getQuantity());
	}
}