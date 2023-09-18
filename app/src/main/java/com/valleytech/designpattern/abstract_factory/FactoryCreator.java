package com.valleytech.designpattern.abstract_factory;

public interface FactoryCreator {

    public AbstractFactory getNormalShapeFactory();

    public AbstractFactory getRoundedShapeFactory();
}
