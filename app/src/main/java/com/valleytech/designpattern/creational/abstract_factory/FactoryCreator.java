package com.valleytech.designpattern.creational.abstract_factory;

public interface FactoryCreator {

    public AbstractFactory getNormalShapeFactory();

    public AbstractFactory getRoundedShapeFactory();
}
