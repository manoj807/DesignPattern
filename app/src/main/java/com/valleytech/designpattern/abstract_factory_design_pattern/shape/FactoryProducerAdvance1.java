package com.valleytech.designpattern.abstract_factory_design_pattern.shape;

public class FactoryProducerAdvance1 implements FactoryCreator
{


    private FactoryProducerAdvance1()
    {

    }

    @Override
    public AbstractFactory getNormalShapeFactory() {
        return new NormalShapeFactory();
    }

    @Override
    public AbstractFactory getRoundedShapeFactory() {
        return new RoundedShapeFactory();
    }


    public static FactoryProducerAdvance1 getInstance()
    {

        return InnerClass.Instance;

    }


    static class InnerClass{
       public static FactoryProducerAdvance1 Instance=new FactoryProducerAdvance1();
    }


}
