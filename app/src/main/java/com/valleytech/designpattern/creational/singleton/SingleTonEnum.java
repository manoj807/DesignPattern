package com.valleytech.designpattern.creational.singleton;

public enum SingleTonEnum {

    INSTANCE(12);
    private int value;
    SingleTonEnum(int value){
        this.value=value;
    }


    public void something(){

        System.out.println("something");

    }


}
