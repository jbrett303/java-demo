package com.kenzan.javademo.controller.math;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.kenzan.javademo.maths.Maths;

@RestController
public class MathController{

    @RequestMapping(value="/math/average/", method=RequestMethod.GET)
    public double getAverage(@RequestBody MathRangeRequestFields requestFields){
        return Maths.average(requestFields.range);
    }
    
    @RequestMapping(value="/math/sum/", method=RequestMethod.GET)
    public double getSum(@RequestBody MathRangeRequestFields requestFields){
        return Maths.sum_a_bunches(requestFields.range);
    }   

    @RequestMapping(value="/math/fibonacci/", method=RequestMethod.GET)
    public double getFib(@RequestBody MathRangeRequestFields requestFields){
        return Maths.fibonacci(requestFields.number);
    }   

    @RequestMapping(value="/math/factorial/", method=RequestMethod.GET)
    public double getFact(@RequestBody MathRangeRequestFields requestFields){
        return Maths.factorial(requestFields.number);
    }   
}