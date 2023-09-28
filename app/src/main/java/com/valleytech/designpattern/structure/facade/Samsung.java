package com.valleytech.designpattern.structure.facade;

public class Samsung implements MobileShop
{
    @Override
    public void modelNo() {
        System.out.println("6 Samsung Mobile");
    }

    @Override
    public void price() {

        System.out.println("6000");

    }


}
