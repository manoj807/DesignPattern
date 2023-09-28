package com.valleytech.designpattern.creational.singleton;

import java.lang.reflect.Constructor;

public class RetrofitSingletonTest {

    public static void main(String srt[]){

        BillPughSingleton billPughSingleton=BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton1=null;

        try {
            Constructor constructors[]=BillPughSingleton.class.getDeclaredConstructors();

            for( Constructor constructor:constructors)
            {
                constructor.setAccessible(true);
                if(constructor.newInstance() instanceof BillPughSingleton) {
                    billPughSingleton1 = (BillPughSingleton) constructor.newInstance();
                    break;
                }

            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("billPughSingleton::"+billPughSingleton.hashCode());
        System.out.println("billPughSingleton1::"+billPughSingleton1.hashCode());




    }


}
