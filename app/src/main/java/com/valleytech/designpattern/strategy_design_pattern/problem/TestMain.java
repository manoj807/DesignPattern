package com.valleytech.designpattern.strategy_design_pattern.problem;

public class TestMain {

    public  static void main(String ar[])
    {
         Vehicle vehicle=new PassengerVehicle();
         vehicle.drive();

         vehicle=new OffRoadVehicle();
         vehicle.drive();

         vehicle=new SportVehicle();
         vehicle.drive();

       //PassengerVehicle and OffRoadVehicle contain same functionality


    }
}
