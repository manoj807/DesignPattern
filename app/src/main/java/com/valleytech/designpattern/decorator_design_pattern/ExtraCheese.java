package com.valleytech.designpattern.decorator_design_pattern;

public class ExtraCheese extends ToppingDecorator
{
  private BasePizza basePizza;
   public ExtraCheese(BasePizza basePizza)
   {
       this.basePizza=basePizza;

   }
    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
