package com.valleytech.designpattern.creational.builder;

public class User
{
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional


    private User(Builder builder) {

        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.age=builder.age;
        this.phone=builder.phone;
        this.address=builder.address;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }

   static class Builder{

       private final String firstName; // required
       private final String lastName; // required
       private int age; // optional
       private String phone; // optional
       private String address; // optional

       public Builder(String firstName,String lastName )
       {
           this.firstName=firstName;
           this.lastName=lastName;

       }

       public Builder age(int age) {
           this.age = age;
           return this;
       }

       public Builder phone(String phone) {
           this.phone = phone;
           return this;
       }

       public Builder address(String address) {
           this.address = address;
           return this;
       }

       User build()
       {
           return new User(this);
       }
   }




}
