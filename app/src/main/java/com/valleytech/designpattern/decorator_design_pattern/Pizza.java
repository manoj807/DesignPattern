package com.valleytech.designpattern.decorator_design_pattern;

public class Pizza
{
    public  static void main(String ar[])
    {
        BasePizza farmHouse=new FarmHouse();

        BasePizza mushroom=new Mushroom(farmHouse);
        BasePizza extraCheese=new ExtraCheese(mushroom);

        System.out.println("extraCheese->"+extraCheese.cost());



    }
}
