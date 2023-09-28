package com.valleytech.designpattern.behavioral.strategy.solution;

public class SportVehicle extends Vehicle {


    public SportVehicle() {
        super(new SportDriveStrategy());
    }

    @Override
    public void drive()
    {
        System.out.println("Special Drive");
    }
}
