package com.kenzan.javademo.controller.math;

import java.util.ArrayList;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Digits;

public class MathRangeRequestFields{
    @NotEmpty(message = "Range must not be empty")
    private ArrayList<@Digits(fraction = 0, integer = 7, 
        message = "Range values must be integers between 0-9,999,999") 
        @PositiveOrZero(
        message = "Items in Range must be non-negative integers") 
        Float> range;

    public ArrayList<Float> getRange(){
        return range;
    }
}