package com.valleytech.designpattern.facade;

public class Iphone implements MobileShop
{
    @Override
    public void modelNo() {
        System.out.println("5 Iphone Mobile");
    }

    @Override
    public void price() {

        System.out.println("60000");

    }


}
