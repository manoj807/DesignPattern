package com.valleytech.designpattern.abstract_factory;

public class FactoryProducerAdvance2 implements RoundedShapeFactoryCreator, NormalShapeFactoryCreator
{


    private FactoryProducerAdvance2()
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


    public static FactoryProducerAdvance2 getInstance()
    {

        return InnerClass.Instance;

    }


    static class InnerClass{
       public static FactoryProducerAdvance2 Instance=new FactoryProducerAdvance2();
    }


}
