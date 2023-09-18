package com.valleytech.designpattern.strategy.solution;

public class SportDriveStrategy implements DriveStrategy
{
    @Override
    public void drive() {
        System.out.println("Sport Drive");
    }
}
