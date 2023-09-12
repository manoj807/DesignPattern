package com.valleytech.designpattern.flyweight;

public class ThinPen implements Pen
{
    BrushSize brushSize=BrushSize.THIN;
    String color=null;
    @Override
    public void setColor(String color) {
     this.color=color;
    }

    @Override
    public void draw(String content) {
     System.out.println("Drawing THIN content in color : " + color);
    }
}
