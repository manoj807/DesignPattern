package com.valleytech.designpattern.abstract_factory_design_pattern.shape;

public interface FactoryCreator {

    public AbstractFactory getNormalShapeFactory();

    public AbstractFactory getRoundedShapeFactory();
}
