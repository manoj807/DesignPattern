package com.valleytech.designpattern.strategy_design_pattern.solution;

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
