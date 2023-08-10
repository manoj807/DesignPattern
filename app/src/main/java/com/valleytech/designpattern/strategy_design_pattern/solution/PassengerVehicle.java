package com.valleytech.designpattern.strategy_design_pattern.solution;

public class PassengerVehicle extends Vehicle
{

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }


}
