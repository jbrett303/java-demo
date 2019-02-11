package com.kenzan.javademo.controller.math;

import javax.validation.constraints.PositiveOrZero;

/**
 * Class to validate input using java bean validation.  Expects a single integer field 'number' in a json object.
 */
public class MathNumberRequestFields{
    @PositiveOrZero(message = "Number must be a non-negative number")
    public int number;
}