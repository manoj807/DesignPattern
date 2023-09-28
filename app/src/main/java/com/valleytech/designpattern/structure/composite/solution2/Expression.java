package com.valleytech.designpattern.structure.composite.solution2;

public class Expression  implements  ArithmeticExpression
{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftPart, ArithmeticExpression rightPart, Operation operation){
        this.leftExpression = leftPart;
        this.rightExpression = rightPart;
        this.operation = operation;
    }




    @Override
    public int evaluate() {

        int value=0;

        switch (operation)
        {
            case ADD:{
                value=leftExpression.evaluate()+rightExpression.evaluate();

                break;
            }
            case SUBTRACT:{
                value=leftExpression.evaluate()-rightExpression.evaluate();

                break;
            }

            case MULTIPLY:{
                value=leftExpression.evaluate()*rightExpression.evaluate();

                break;
            }
            case DIVIDE:
            {
                value=leftExpression.evaluate()/rightExpression.evaluate();

                break;
            }

            default:
            {value=0;}
        }


        return value;
    }
}
