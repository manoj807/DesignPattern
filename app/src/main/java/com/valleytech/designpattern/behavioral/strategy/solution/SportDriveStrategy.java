package com.valleytech.designpattern.behavioral.strategy.solution;

public class SportDriveStrategy implements DriveStrategy
{
    @Override
    public void drive() {
        System.out.println("Sport Drive");
    }
}
