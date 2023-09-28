package com.valleytech.designpattern.creational.singleton;

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
