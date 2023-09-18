package com.valleytech.designpattern.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {


    private SerializedSingleton()
    {

    }

    public static SerializedSingleton getInstance()
    {
        return SerializedSingleton.Inner.billPughSingleton;
    }

    static class Inner{
        private final static SerializedSingleton billPughSingleton =new SerializedSingleton();


    }


}
