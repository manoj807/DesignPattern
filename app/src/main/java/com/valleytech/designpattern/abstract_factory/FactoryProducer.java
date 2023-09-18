package com.valleytech.designpattern.abstract_factory;

public class FactoryProducer
{


    public enum FactoryType {
        NORMAL,
        ROUNDED
    }
    public static AbstractFactory getFactory(FactoryType factoryType){


        switch(factoryType)
        {
            case  NORMAL:{
              return  new RoundedShapeFactory();
            }

            case  ROUNDED:{
                return  new NormalShapeFactory();
            }

            default:{
              return null;
            }
        }


    }
}