package com.valleytech.designpattern.behavioral.strategy.solution;

public class OffRoadVehicle extends Vehicle
{

    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
