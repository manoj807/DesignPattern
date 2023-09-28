package com.valleytech.designpattern.behavioral.strategy.solution;

public class PassengerVehicle extends Vehicle
{

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }


}
