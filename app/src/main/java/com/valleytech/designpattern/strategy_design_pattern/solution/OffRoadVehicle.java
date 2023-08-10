package com.valleytech.designpattern.strategy_design_pattern.solution;

public class OffRoadVehicle extends Vehicle
{

    public OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
