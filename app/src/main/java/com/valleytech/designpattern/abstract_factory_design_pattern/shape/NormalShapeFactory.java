package com.valleytech.designpattern.abstract_factory_design_pattern.shape;

public class NormalShapeFactory implements AbstractFactory
{

    @Override
    public Shape getShape(ShapeType shapeType) {

        switch(shapeType)
        {
            case RECTANGULAR:{
                return new NormalRectangular();
            }

            case SQUARE:{
                return new NormalSquare();
            }

            default:{
                return null;
            }

        }
    }

}
