package com.valleytech.designpattern.creational.factory;


public class ClientWithoutFactory
{
    // if you want to create triangle type object then we need to change ClientWithoutFactory class for create this type object.
    // this is violeta of open close principle of SOLID.Then this is not good design pattern for factory method.
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
