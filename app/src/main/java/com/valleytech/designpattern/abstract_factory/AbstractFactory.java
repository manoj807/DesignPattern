package com.valleytech.designpattern.abstract_factory;

public interface AbstractFactory
{
    public enum ShapeType {
        RECTANGULAR,
        SQUARE
    }

    abstract Shape getShape(ShapeType shapeType) ;


}
