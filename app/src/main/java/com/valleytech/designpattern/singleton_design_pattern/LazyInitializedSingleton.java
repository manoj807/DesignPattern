package com.valleytech.designpattern.singleton_design_pattern;

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
