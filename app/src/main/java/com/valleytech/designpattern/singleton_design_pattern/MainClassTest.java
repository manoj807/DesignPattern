package com.valleytech.designpattern.singleton_design_pattern;

public class MainClassTest {
    public static void main(String str[])
    {
        SingleTonEnum singleTonEnum=SingleTonEnum.INSTANCE;

        singleTonEnum.something();
    }
}
