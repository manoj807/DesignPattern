package com.valleytech.designpattern.creational.builder;

public class BuilderMain
{
    public  static void main(String ar[])
    {
        User userUser= new User.Builder("Manoj","Kumar").age(35).phone("12312345").build();

        System.out.println(userUser);

    }

}
