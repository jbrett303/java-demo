package com.kenzan.javademo.controller.shapes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.kenzan.javademo.shapes.Shapes;
import com.kenzan.javademo.shapes.ShapeStore;
import com.kenzan.javademo.shapes.Circle;
import com.kenzan.javademo.shapes.Rectangle;
import com.kenzan.javademo.shapes.Ellipse;
import java.util.List;

import javax.validation.Valid;

import java.util.ArrayList;



@RestController
public class ShapesController
{
    /**
     * get all shapes
     */
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
    public Circle postCircle(@Valid @RequestBody CircleRequestFields requestFields){
        return new Circle(requestFields.name, requestFields.radius);
    }

    @RequestMapping(value="/shapes/rectangle/", method=RequestMethod.POST)
    public Rectangle postRectangle(@Valid @RequestBody RectangleRequestFields requestFields){
        return new Rectangle(requestFields.name, requestFields.length, requestFields.width);
    }

    @RequestMapping(value="/shapes/ellipse/", method=RequestMethod.POST)
    public Ellipse postEllipse(@Valid @RequestBody EllipseRequestFields requestFields){
        return new Ellipse(requestFields.name, requestFields.radiusOne, requestFields.radiusTwo);
    }
    
}