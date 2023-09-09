package com.valleytech.designpattern.singleton_design_pattern;

public class StaticBlockSingleton {

    private static  StaticBlockSingleton staticBlockSingleton=null;


    private StaticBlockSingleton()
    {

    }

    static {

        try {
           staticBlockSingleton = new StaticBlockSingleton();

        }catch (Exception e)
        {
            throw new RuntimeException("Exception occurred in creating singleton instance");

        }
    }

    public static StaticBlockSingleton getInstance()
    {
        return  staticBlockSingleton;

    }



}
