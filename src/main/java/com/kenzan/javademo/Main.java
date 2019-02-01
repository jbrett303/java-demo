package com.kenzan.javademo;

import java.util.*;

public class Main {

    public static void main(String[] args){

    	int[] hundred = new int[100];
		for (int i = 0; i <= 99; i++){
			hundred[i] = i + 1;
		}

		//exercise 1
		int sum_o_numbas = Maths.sum_a_bunches(hundred);
		System.out.println("The sum of integers 1-100 is " + sum_o_numbas);

		float average = Maths.average(hundred);
		System.out.println("The average of integers 1-100 is " + average);

		// exercise 2
		int facts = Maths.factorial(5);
		System.out.println("The factorial of 5 is " + facts);

		int fibs = Maths.fibonacci(5);
		System.out.println("The fibonacci of 5 is " + fibs);

		// exercise 3
		Circle circle = new Circle("greg",5);
		System.out.println(circle.getArea());
		new Rectangle("bob",4, 5);
		System.out.println(circle.getArea());

		Map<String, Shapes> shapeMap = ShapeStore.getShapeMap();
		System.out.println(shapeMap);
		TreeMap<String, Shapes> sortedShapeMap = new TreeMap<>(shapeMap);
		System.out.println(sortedShapeMap);

		List<Shapes> shapeList = ShapeStore.getShapeList();
		System.out.println(shapeList);
		Collections.sort(shapeList);
		System.out.println(shapeList);

		System.out.println("test " + ShapeStore.getShapeList("Circle"));


		System.out.println("There are " + Circle.getQuantity() +  " circles");
		System.out.println("There are " + Rectangle.getQuantity() +  " rectangles");
		System.out.println("There are " + Shapes.getQuantity() +  " shapes");

	}
}
