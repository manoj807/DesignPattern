package com.valleytech.designpattern.singleton_design_pattern;

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
