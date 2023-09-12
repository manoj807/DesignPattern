package com.valleytech.designpattern.flyweight;

public class FlyweightMain {

    public static void main(String str[])
    {

        Pen mediumBlue=Factory.getMedIumPen("Blue");
        mediumBlue.draw("Hello Word");

        Pen thinRed=Factory.getThinPen("Red");
        thinRed.draw("Hello Word");


        Pen thickRed=Factory.getThickPen("Yellow");
        thickRed.draw("Hello Word");

    }
}
