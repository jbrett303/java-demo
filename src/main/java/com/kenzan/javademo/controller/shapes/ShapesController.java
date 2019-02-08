package com.kenzan.javademo.controller.shapes;

import org.springframework.validation.BindingResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import com.kenzan.javademo.shapes.Shapes;
import com.kenzan.javademo.shapes.ShapeStore;
import com.kenzan.javademo.shapes.Circle;
import com.kenzan.javademo.shapes.Rectangle;
import com.kenzan.javademo.shapes.Ellipse;
import com.kenzan.javademo.controller.Controller;
import java.util.List;

import javax.validation.Valid;

import java.util.ArrayList;



@RestController
public class ShapesController extends Controller
{

   @RequestMapping(value="/shapes/", method=RequestMethod.GET)
    public List<Shapes> getShapes(
        @RequestBody(required=false) GetRequestFields requestFields
        ){
            if (requestFields != null){
                if (requestFields.name != null){
                    List<Shapes> neo = new ArrayList<>();
                    neo.add(ShapeStore.getShapeByName(requestFields.name));
                    return neo;
                }
                if (requestFields.type != null){
                    return ShapeStore.getShapeList(requestFields.type);
                }
            }
            return ShapeStore.getShapeList();
    }

    @RequestMapping(value="/shapes/circle/", method=RequestMethod.POST)
    public Circle postCircle(@Valid @RequestBody CircleRequestFields requestFields, BindingResult result){       
        if (result.hasFieldErrors()) {
            throwFieldError(result.getFieldError());
        }
        try {
            return new Circle(requestFields.name, requestFields.radius);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(
          HttpStatus.BAD_REQUEST, "Name already exists, shapes cannot have identical names", ex);
        }
    }

    @RequestMapping(value="/shapes/rectangle/", method=RequestMethod.POST)
    public Rectangle postRectangle(@Valid @RequestBody RectangleRequestFields requestFields, BindingResult result){
        if (result.hasFieldErrors()) {
            throwFieldError(result.getFieldError());
        }
        try {
            return new Rectangle(requestFields.name, requestFields.length, requestFields.width);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(
          HttpStatus.BAD_REQUEST, "Name already exists, shapes cannot have identical names", ex);
        }
    }

    @RequestMapping(value="/shapes/ellipse/", method=RequestMethod.POST)
    public Ellipse postEllipse(@Valid @RequestBody EllipseRequestFields requestFields, BindingResult result){
        if (result.hasFieldErrors()) {
            throwFieldError(result.getFieldError());
        }
        try {
            return new Ellipse(requestFields.name, requestFields.radiusOne, requestFields.radiusTwo);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(
          HttpStatus.BAD_REQUEST, "Name already exists, shapes cannot have identical names", ex);
        }
    }
}