package com.kenzan.javademo.controller;

import org.springframework.validation.FieldError;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


public abstract class Controller {
    
    
    protected void throwFieldError(FieldError error){
        String rejectedValue;
        try {
            rejectedValue = error.getRejectedValue().toString();
        } catch (NullPointerException e) {
            rejectedValue = "";
        }
        throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, 
                "Submitted '" + error.getField() + 
                "' field value of: '" +
                rejectedValue + 
                "' is not valid.  " + 
                error.getDefaultMessage());
    }
}