package com.valleytech.designpattern.flyweight;

public class MediumPen implements Pen
{
    BrushSize brushSize=BrushSize.MEDIUM;
    String color=null;
    @Override
    public void setColor(String color) {
     this.color=color;
    }

    @Override
    public void draw(String content) {
     System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
