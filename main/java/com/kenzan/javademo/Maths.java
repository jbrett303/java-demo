package com.kenzan.javademo;

abstract class Maths {

	/**
	 * sum_a_bunches
	 *
	 * calculates the sum of every number in an array of ints
	 * @param numbers an array of ints
	 * @return int sum of all ints in array
	 */
	static int sum_a_bunches(int[] numbers) {
		int running_total = 0;
		for(int value: numbers){
			running_total += value;
		}
		return running_total;
	}

	/**
	 * average
	 *
	 * calculates the average of an array of ints
	 * @param numbers an array of ints
	 * @return float average of an array of ints
	 */
	static float average(int[] numbers) {
		int the_sum = sum_a_bunches(numbers);
		return the_sum / (float) numbers.length;
	}


	/**
	 * factorial
	 *
	 * calculates the factorial of an non-negative integer
	 * @param number int
	 * @return int the factorial of an non-negative integer
	 */
	static int factorial( int number ) {
		if ( number < 0 ) {
			throw new IllegalArgumentException("Number must be non-negative");
		}
		else if ( number == 0 ) {
			return 1;
		}
		else {
			return number * factorial( number - 1 );
		}
	}

	/**
	 * fibonacci
	 *
	 * Calculates the fibonacci of an non-negative integer
	 * @param number int
	 * @return int the fibonacci of an non-negative integer
	 */
	static int fibonacci( int number ) {
		if ( number < 0 ) {
			throw new IllegalArgumentException("Number must be non-negative");
		}
		else if ( number == 1 || number == 0 ) {
			return 1;
		}
		else {
			return fibonacci( number - 1 ) + fibonacci( number - 2 );
		}
	}

}
