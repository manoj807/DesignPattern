package com.valleytech.designpattern.abstract_factory_design_pattern.shape;

import static com.valleytech.designpattern.abstract_factory_design_pattern.shape.AbstractFactory.ShapeType.RECTANGULAR;
import static com.valleytech.designpattern.abstract_factory_design_pattern.shape.AbstractFactory.ShapeType.SQUARE;
import static com.valleytech.designpattern.abstract_factory_design_pattern.shape.FactoryProducer.FactoryType.ROUNDED;

public class FactoryMain
{
    public  static void main(String ar[])
    {

        AbstractFactory abstractFactory=FactoryProducer.getFactory(FactoryProducer.FactoryType.NORMAL);
         Shape shape=abstractFactory.getShape(RECTANGULAR);

        shape.draw();

        AbstractFactory abstractFactory1=FactoryProducer.getFactory(ROUNDED);
        Shape shape1=abstractFactory.getShape(SQUARE);

        shape1.draw();




    }
}
