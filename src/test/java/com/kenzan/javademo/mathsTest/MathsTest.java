package com.kenzan.javademo.mathsTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.kenzan.javademo.maths.*;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

	static int[] hundred = new int[100];

	@BeforeAll
	static void setup() {
		for (int i = 0; i <= 99; i++){
			hundred[i] = i + 1;
		}
	}

	@Test
	void sum_a_bunches() {
		int sum_o_numbas = Maths.sum_a_bunches(hundred);
		assertEquals(5050, sum_o_numbas);
	}

	@Test
	void average() {
		float average = Maths.average(hundred);
		assertEquals(50.5, average);
	}

	@Test
	void factorial() {
		int fact = Maths.factorial(5);
		assertEquals(120, fact);

		assertThrows(IllegalArgumentException.class, ()-> Maths.factorial(-1));
	}

	@Test
	void fibonacci() {
		int fib = Maths.fibonacci(5);
		assertEquals(8, fib);

		assertThrows(IllegalArgumentException.class, ()-> Maths.fibonacci(-1));
	}
}