package com.valleytech.designpattern.creational.abstract_factory;

import static com.valleytech.designpattern.creational.abstract_factory.AbstractFactory.ShapeType.RECTANGULAR;
import static com.valleytech.designpattern.creational.abstract_factory.AbstractFactory.ShapeType.SQUARE;

public class FactoryMain
{
    public  static void main(String ar[])
    {

        /*AbstractFactory abstractFactory=FactoryProducer.getFactory(FactoryProducer.FactoryType.NORMAL);
         Shape shape=abstractFactory.getShape(RECTANGULAR);

        shape.draw();

        AbstractFactory abstractFactory1=FactoryProducer.getFactory(ROUNDED);
        Shape shape1=abstractFactory1.getShape(SQUARE);

        shape1.draw();
*/

      /*  AbstractFactory normalShapeFactory =FactoryProducerAdvance1.getInstance().getNormalShapeFactory();
        Shape normalSquareShape=  normalShapeFactory.getShape(SQUARE);
        normalSquareShape.draw();

        AbstractFactory normalShapeFactory1 =FactoryProducerAdvance1.getInstance().getRoundedShapeFactory();
        Shape rounedSquareShape=  normalShapeFactory1.getShape(SQUARE);
        rounedSquareShape.draw();*/

        AbstractFactory normalShapeFactory =FactoryProducerAdvance2.getInstance().getNormalShapeFactory();
        Shape normalSquareShape=  normalShapeFactory.getShape(SQUARE);
        normalSquareShape.draw();

        AbstractFactory normalShapeFactory1 =FactoryProducerAdvance2.getInstance().getRoundedShapeFactory();
        Shape rounedSquareShape=  normalShapeFactory1.getShape(RECTANGULAR);
        rounedSquareShape.draw();




    }
}
