package com.valleytech.designpattern.singleton_design_pattern;

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
