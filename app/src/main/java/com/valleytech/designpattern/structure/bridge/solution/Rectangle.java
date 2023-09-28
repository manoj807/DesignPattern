package com.valleytech.designpattern.structure.bridge.solution;

public class Rectangle extends Shape
{
        ColorImplementor colorImplementor;
        public  Rectangle(ColorImplementor colorImplementor)
        {
           this.colorImplementor=  colorImplementor;

        }
    @Override
    public void doShapeColor() {

            System.out.println("Color rectangle:");
        colorImplementor.doColor();


    }
}
