package com.valleytech.designpattern.singleton;

public class EagerInitializedSingleton {

    private EagerInitializedSingleton()
    {

    }

    private final static EagerInitializedSingleton eagerInitializedSingleton=new EagerInitializedSingleton();

    public static EagerInitializedSingleton getInstance()
    {
        return eagerInitializedSingleton;
    }




}
