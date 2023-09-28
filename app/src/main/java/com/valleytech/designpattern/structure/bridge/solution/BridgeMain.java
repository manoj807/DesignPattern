package com.valleytech.designpattern.structure.bridge.solution;

import com.valleytech.designpattern.structure.bridge.problem.BlueCircle;

public class BridgeMain {

    public static void main(String arf[]) {

        Shape circle=new Circle(new RedColorImplementor());
        circle.doShapeColor();

        Shape rec=new Rectangle(new BlueColorImplementor());
        rec.doShapeColor();


    }

}
