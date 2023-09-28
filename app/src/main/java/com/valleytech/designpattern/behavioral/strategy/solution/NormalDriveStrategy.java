package com.valleytech.designpattern.behavioral.strategy.solution;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
