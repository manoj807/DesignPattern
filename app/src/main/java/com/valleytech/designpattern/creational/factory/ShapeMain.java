package com.valleytech.designpattern.creational.factory;


public class ShapeMain {

    public  static void main(String ar[])
    {

        Shape shape=ShapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE);

           shape.draw();

    }
}
