package com.valleytech.designpattern.structure.decorator;

public class Mushroom  extends ToppingDecorator
{
  private BasePizza basePizza;
   public  Mushroom(BasePizza basePizza)
   {
       this.basePizza=basePizza;

   }
    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
