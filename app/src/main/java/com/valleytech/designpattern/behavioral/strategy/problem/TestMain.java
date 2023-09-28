package com.valleytech.designpattern.behavioral.strategy.problem;

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
