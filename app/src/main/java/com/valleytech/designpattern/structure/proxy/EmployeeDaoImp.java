package com.valleytech.designpattern.structure.proxy;

public class EmployeeDaoImp implements EmployeeDao
{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Create new row in the Employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        System.out.println("delete row with employeeID::"+employeeId);

    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {

        System.out.println("Fetching data from the DB::");
        return new EmployeeDo();
    }
}
