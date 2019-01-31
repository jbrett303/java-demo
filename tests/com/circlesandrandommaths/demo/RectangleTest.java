package com.circlesandrandommaths.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

	@Test
	void getArea() {
		Rectangle rectangle = new Rectangle("Rhonda",5, 10);
		double area = rectangle.getArea();
		assertEquals(50, area);
	}

	@Test
	void getQuantity() {
		int base = Rectangle.getQuantity();
		Rectangle rectangle = new Rectangle("Ricky",5, 10);
		assertEquals(base + 1, Rectangle.getQuantity());
		Rectangle rectangle2 = new Rectangle("Roland" ,5, 10);
		assertEquals(base + 2, Rectangle.getQuantity());
	}
}