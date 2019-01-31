package com.circlesandrandommaths.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {

	@Test
	void getArea() {
		Ellipse ellipse = new Ellipse("Ellie",5, 10);
		double area = ellipse.getArea();
		assertEquals(157.07963267948966, area);
	}

	@Test
	void getQuantity() {
		int base = Ellipse.getQuantity();
		Ellipse ellipse = new Ellipse("Eggbert",5, 10);
		assertEquals(base + 1, Ellipse.getQuantity());
		Ellipse ellipse2 = new Ellipse("Embry",5, 10);
		assertEquals(base + 2, Ellipse.getQuantity());
	}
}