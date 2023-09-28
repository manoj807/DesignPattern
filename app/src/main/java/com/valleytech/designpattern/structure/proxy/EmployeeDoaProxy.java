package com.valleytech.designpattern.structure.proxy;

public class EmployeeDoaProxy implements EmployeeDao
{

     EmployeeDao employeeDao;

     public EmployeeDoaProxy()
     {
         employeeDao=new EmployeeDaoImp();
     }


    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("Admin"))
        {
            employeeDao.create(client,obj);

            return;
        }

        throw new Exception("Access Denied");

    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("Admin"))
        {
            employeeDao.delete(client,employeeId);

            return;
        }

        throw new Exception("Access Denied");


    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {

        if(client.equals("Admin") || client.equals("User"))
        {
          return employeeDao.get(client,employeeId);
        }

        throw new Exception("Access Denied");
    }
}
