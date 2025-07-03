package com.valleytech.designpattern.creational.factory;

public class CircleFactory implements  ShapeFactory
{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
