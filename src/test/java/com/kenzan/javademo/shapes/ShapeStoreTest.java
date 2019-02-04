package com.kenzan.javademo.shapes;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.Map;

class ShapeStoreTest {

    @Test
    void getShapeMap() {
        Rectangle rectangle = new Rectangle("Ralphie",5, 10);
        Map<String, Shapes> shapeMap = ShapeStore.getShapeMap();
        assertEquals(rectangle, shapeMap.get("Ralphie"));
    }

    @Test
    void getShapeList() {
        Rectangle rectangle = new Rectangle("Rodolpho",5, 10);
        List<Shapes> shapeList = ShapeStore.getShapeList();
        assertThat(shapeList, contains(rectangle));
    }
}