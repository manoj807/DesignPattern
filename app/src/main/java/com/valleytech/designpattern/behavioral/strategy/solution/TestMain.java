package com.valleytech.designpattern.behavioral.strategy.solution;

public class TestMain {

    public  static void main(String ar[])
    {
         Vehicle vehicle=new PassengerVehicle();
         vehicle.drive();

         vehicle=new OffRoadVehicle();
         vehicle.drive();

         vehicle=new SportVehicle();
         vehicle.drive();

       //SportVehicle and SportVehicle contain same functionality


    }
}
