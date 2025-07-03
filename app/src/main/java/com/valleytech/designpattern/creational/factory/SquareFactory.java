package com.valleytech.designpattern.creational.factory;

public class SquareFactory implements ShapeFactory
{
    @Override
    public Shape createShape() {
        return new Square();
    }
}

