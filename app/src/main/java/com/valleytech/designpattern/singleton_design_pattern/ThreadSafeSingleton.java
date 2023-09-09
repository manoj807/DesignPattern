package com.valleytech.designpattern.singleton_design_pattern;

public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {

    }

    private static ThreadSafeSingleton threadSafeSingleton;

    private synchronized  static ThreadSafeSingleton getInstance()
    {

                if (threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                }


        return threadSafeSingleton;

    }


}
