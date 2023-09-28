package com.valleytech.designpattern.creational.singleton;

public class LazyInitializedSingleton {


    private static LazyInitializedSingleton lazyInitializedSingleton =null;
    private LazyInitializedSingleton()
    {


    }

    public static LazyInitializedSingleton getInstance()
    {

        if(lazyInitializedSingleton==null)
        {
            lazyInitializedSingleton=new LazyInitializedSingleton();
        }

        return lazyInitializedSingleton;

    }

   /* static class  InnerClass{

        private static LazyInitializedSingleton lazyInitializedSingleton=new LazyInitializedSingleton();

    }*/

}
