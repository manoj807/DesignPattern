package com.valleytech.designpattern.structure.proxy;

public class ProxyClient {

    public  static void main(String arf[])
    {

        try {

            EmployeeDao employeeDao=new EmployeeDoaProxy();
            employeeDao.create("Admin", new EmployeeDo());

            System.out.println("Operation successful");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }



    }
}
