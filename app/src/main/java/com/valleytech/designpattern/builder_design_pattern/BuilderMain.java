package com.valleytech.designpattern.builder_design_pattern;

public class BuilderMain
{
    public  static void main(String ar[])
    {
        User userUser= new User.Builder("Manoj","Kumar").age(35).phone("12312345").build();

        System.out.println(userUser);

    }

}
