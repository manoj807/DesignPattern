package com.valleytech.designpattern.strategy.solution;

public class OffRoadVehicle extends Vehicle
{

    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
