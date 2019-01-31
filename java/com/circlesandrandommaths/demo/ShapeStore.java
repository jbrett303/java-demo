package com.circlesandrandommaths.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ShapeStore {

	private static Map <String, Shapes> shapeMap = new HashMap<String, Shapes>();
	private static List shapeList = new ArrayList();


	public static void storeShape(Shapes shape){
		shapeMap.put(shape.name, shape);
		shapeList.add(shape);
	}

	public static Map getShapeMap() {
		return shapeMap;
	}

	public static List getShapeList() {
		return shapeList;
	}

	public static Shapes getShapeByName(String name){
		return shapeMap.get(name);
	}

}
