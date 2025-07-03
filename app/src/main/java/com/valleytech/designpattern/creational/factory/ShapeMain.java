package com.valleytech.designpattern.creational.factory;


public class ShapeMain {

    public  static void main(String ar[])
    {

           Shape shape= ClientWithoutFactory.getShape(ClientWithoutFactory.ShapeType.CIRCLE);

              shape.draw();

                Shape circle= ClientWithFactory.getShape(new CircleFactory());
                circle.draw();

                Shape square= ClientWithFactory.getShape(new SquareFactory());
                square.draw();

    }
}
