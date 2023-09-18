package com.valleytech.designpattern.singleton;

public class MainClassTest {
    public static void main(String str[])
    {
        SingleTonEnum singleTonEnum=SingleTonEnum.INSTANCE;

        singleTonEnum.something();
    }
}
