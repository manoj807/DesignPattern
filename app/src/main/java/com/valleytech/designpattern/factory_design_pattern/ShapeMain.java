package com.valleytech.designpattern.factory_design_pattern;


public class ShapeMain {

    public  static void main(String ar[])
    {

        Shape shape=ShapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE);

           shape.draw();

    }
}
