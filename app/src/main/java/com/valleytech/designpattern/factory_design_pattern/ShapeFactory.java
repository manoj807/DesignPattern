package com.valleytech.designpattern.factory_design_pattern;

import com.valleytech.designpattern.abstract_factory_design_pattern.shape.Shape;

public class ShapeFactory
{
    public static Shape getShape(String input)
    {
        switch(input)
        {
            case "Circle":{
               return new Circle();
             }

            case "Rectangular":{
                return new Rectangular();
            }

            case "Square":{
                return new Square();
            }
            default:{
             return null;
            }

        }
    }
}
