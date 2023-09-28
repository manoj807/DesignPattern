package com.valleytech.designpattern.structure.bridge.solution;

public class Circle extends Shape
{

    ColorImplementor colorImplementor;
    public  Circle(ColorImplementor colorImplementor)
    {
        this.colorImplementor=  colorImplementor;

    }
    @Override
    public void doShapeColor() {
        System.out.println("Color Circle:");
        colorImplementor.doColor();
    }


}
