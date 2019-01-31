package com.kenzan.javademo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {

	@Test
	void incrementAndGetQty() {
		int base = Shapes.getQuantity();
		Circle circle = new Circle("Collin",5);
		assertEquals(base + 1, Circle.getQuantity());
		Circle circle2 = new Circle("Catalina",5);
		assertEquals(base + 2, Circle.getQuantity());
	}

	@Test
	void checkName() {
		Circle circle = new Circle("Chris",5);
		Circle circle2 = new Circle("Corey",5);
		assertThrows(IllegalArgumentException.class, ()-> new Circle("Chris", 5));
	}
}
