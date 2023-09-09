package com.valleytech.designpattern.singleton_design_pattern;

public class ThreadSafeDoubleCheckSingleton {

   private ThreadSafeDoubleCheckSingleton() {

    }

    private static ThreadSafeDoubleCheckSingleton threadSafeSingleton;

    private static ThreadSafeDoubleCheckSingleton getInstance()
    {
        if (threadSafeSingleton == null) {
            synchronized (ThreadSafeDoubleCheckSingleton.class) {
                if (threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeDoubleCheckSingleton();
                }
            }
        }
        return threadSafeSingleton;

    }
}
