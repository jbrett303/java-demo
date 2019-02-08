package com.kenzan.javademo.controller.math;

import com.kenzan.javademo.controller.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.List;


import com.kenzan.javademo.maths.Maths;

@RestController
public class MathController extends Controller{
    Logger logger = Logger.getLogger("MathController");

    @RequestMapping(value="/math/average/", method=RequestMethod.GET)
    public double getAverage(@Valid @RequestBody MathRangeRequestFields requestFields, BindingResult result){
        if (result.hasFieldErrors()) {
            throwFieldError(result.getFieldError());
        }
        return Maths.average(getIntegerList(requestFields.getRange()));
    }
    
    @RequestMapping(value="/math/sum/", method=RequestMethod.GET)
    public double getSum(@Valid @RequestBody MathRangeRequestFields requestFields, BindingResult result){
        if (result.hasFieldErrors()) {
            throwFieldError(result.getFieldError());
        }
        return Maths.sum_a_bunches(getIntegerList(requestFields.getRange()));
    }   

    @RequestMapping(value="/math/fibonacci/", method=RequestMethod.GET)
    public double getFib(@Valid @RequestBody MathNumberRequestFields requestFields, BindingResult result){
        if (result.hasFieldErrors()) {
            throwFieldError(result.getFieldError());
        }
        return Maths.fibonacci(requestFields.number);
    }   

    @RequestMapping(value="/math/factorial/", method=RequestMethod.GET)
    public double getFact(@Valid @RequestBody MathNumberRequestFields requestFields, BindingResult result){
        if (result.hasFieldErrors()) {
            throwFieldError(result.getFieldError());
        }
        return Maths.factorial(requestFields.number);
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Object> handleException(Exception ex) {
        logger.log(Level.WARNING, ex.getCause().getMessage());

        return new ResponseEntity<>("There is a problem with your supplied data formats.  Please review the api documentations to ensure that your submission is coorect", HttpStatus.BAD_REQUEST);
        }

	private List<Integer> getIntegerList(List<Float> floats){
        List<Integer> ints = new ArrayList<Integer>();
        for (int  i = 0; i<floats.size(); i++){
            ints.add(floats.get(i).intValue());
        }
        return ints;
    }
}