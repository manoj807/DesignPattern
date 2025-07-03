package com.valleytech.designpattern.creational.factory;

public class RectangularFactory  implements ShapeFactory
{
    @Override
    public Shape createShape() {
        return new Rectangular();
    }
}

