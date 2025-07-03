package com.valleytech.designpattern.creational.factory;

public class ClientWithFactory
{
    public static Shape getShape(ShapeFactory shapeFactory)
    {
        return shapeFactory.createShape();
    }

}
