package com.valleytech.designpattern.creational.factory;


public class ShapeFactory
{

    public static Shape getShape(ShapeType input)
    {
        switch(input)
        {
            case CIRCLE:{
               return new Circle();
             }

            case RECTANGULAR:{
                return new Rectangular();
            }

            case SQUARE:{
                return new Square();
            }
            default:{
             return null;
            }

        }
    }

    enum ShapeType{
        CIRCLE,
        SQUARE,
        RECTANGULAR



    }
}
