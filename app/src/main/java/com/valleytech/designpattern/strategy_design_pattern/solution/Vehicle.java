package com.valleytech.designpattern.strategy_design_pattern.solution;

public class Vehicle {

    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy=driveStrategy;
    }
    public void drive()
    {

        driveStrategy.drive();
    }
}
