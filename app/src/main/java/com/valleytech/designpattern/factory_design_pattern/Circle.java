package com.valleytech.designpattern.factory_design_pattern;

import com.valleytech.designpattern.abstract_factory_design_pattern.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
       System.out.println("Circle Draw");

    }
}