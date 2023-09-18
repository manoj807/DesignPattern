package com.valleytech.designpattern.abstract_factory;

public class RoundedShapeFactory implements AbstractFactory
{

  @Override
  public Shape getShape(ShapeType shapeType) {
        switch(shapeType)
        {
            case RECTANGULAR:{
                return new RoundedRectangular();
            }

            case SQUARE:{
                return new RoundedSquare();
            }

            default:{
                return null;
            }

        }
    }
}
