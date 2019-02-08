package com.kenzan.javademo.controller.math;

import javax.validation.constraints.PositiveOrZero;

public class MathNumberRequestFields{
    @PositiveOrZero(message = "Number must be a non-negative number")
    public int number;

    
}