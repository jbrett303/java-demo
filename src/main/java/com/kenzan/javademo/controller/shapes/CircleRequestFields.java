package com.kenzan.javademo.controller.shapes;

import javax.validation.constraints.Positive;

public class CircleRequestFields extends ShapesPostRequestFields{

    @Positive(message = "Radius must be a non-negative number greater than zero")
    double radius;

    public CircleRequestFields(String name, double radius){
        this.name = name;
        this.radius = radius;
    }
}