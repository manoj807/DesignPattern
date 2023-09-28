package com.valleytech.designpattern.structure.facade;

public class BlackBerry implements MobileShop
{
    @Override
    public void modelNo() {
        System.out.println("5 Black Berry Mobile");
    }

    @Override
    public void price() {

        System.out.println("9000");

    }


}
