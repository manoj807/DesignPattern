package com.valleytech.designpattern.strategy.solution;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
