package com.kenzan.javademo.controller.shapes;

import javax.validation.constraints.Positive;

class EllipseRequestFields extends ShapesPostRequestFields{

    @Positive(message = "RadiusOne must be a non-negative number greater than zero")
    double radiusOne;

    @Positive(message = "RadiusTwo must be a non-negative number greater than zero")
    double radiusTwo;

    EllipseRequestFields(String name, double radiusOne, double radiusTwo){
        this.name = name;
        this.radiusOne = radiusOne;
        this.radiusTwo = radiusTwo;
    }
}