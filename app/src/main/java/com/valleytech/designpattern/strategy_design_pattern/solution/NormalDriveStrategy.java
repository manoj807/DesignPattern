package com.valleytech.designpattern.strategy_design_pattern.solution;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
