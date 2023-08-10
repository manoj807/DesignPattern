package com.valleytech.designpattern.abstract_factory_design_pattern.shape;

public interface AbstractFactory
{
    public enum ShapeType {
        RECTANGULAR,
        SQUARE
    }

    abstract Shape getShape(ShapeType shapeType) ;


}
