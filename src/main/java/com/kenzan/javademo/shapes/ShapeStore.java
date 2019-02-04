package com.kenzan.javademo.shapes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class ShapeStore {

	private static Map <String, Shapes> shapeMap = new HashMap<String, Shapes>();
	private static List<Shapes> shapeList = new ArrayList<>();


	public static void storeShape(Shapes shape){
		shapeMap.put(shape.name, shape);
		shapeList.add(shape);
	}

	public static Map<String, Shapes> getShapeMap() {
		return shapeMap;
	}

	public static List<Shapes> getShapeList() {
		return shapeList;
	}

	public static List<Shapes> getShapeList(String shape) {

		return (List<Shapes>)shapeList.stream()
				.filter(
						i -> 0 == i.getClass()
								.getSimpleName()
								.compareTo(shape)
				)
				.collect(Collectors.toList());
	}

	public static Shapes getShapeByName(String name){
		return shapeMap.get(name);
	}

}
