package com.valleytech.designpattern.strategy_design_pattern.solution;

public class SportDriveStrategy implements DriveStrategy
{
    @Override
    public void drive() {
        System.out.println("Sport Drive");
    }
}
