package com.valleytech.designpattern.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton()
    {

    }

    public static BillPughSingleton getInstance()
    {
        return Inner.billPughSingleton;
    }

    static class Inner{
        private final static BillPughSingleton billPughSingleton =new BillPughSingleton();

    }


}
