package com.kenzan.javademo.controller.shapes;

import javax.validation.constraints.Positive;

class RectangleRequestFields extends ShapesPostRequestFields{
    @Positive(message = "Length must be a non-negative number greater than zero")
    double length;

    @Positive(message = "Width must be a non-negative number greater than zero")
    double width;

    RectangleRequestFields(String name, double length, double width){
        this.name = name;
        this.length = length;
        this.width = width;
    }
}