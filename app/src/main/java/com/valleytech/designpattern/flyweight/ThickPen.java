package com.valleytech.designpattern.flyweight;

public class ThickPen implements Pen
{
    BrushSize brushSize=BrushSize.THICK;
    String color=null;
    @Override
    public void setColor(String color) {
     this.color=color;
    }

    @Override
    public void draw(String content) {
     System.out.println("Drawing THICK content in color : " + color);
    }
}
