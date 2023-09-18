package com.valleytech.designpattern.strategy.solution;

public class PassengerVehicle extends Vehicle
{

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }


}
