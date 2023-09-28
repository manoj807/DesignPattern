package com.valleytech.designpattern.creational.prototype;

public class MainClass {
    public  static void main(String ar[]) throws InterruptedException {
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("123.:12:34");
        networkConnection.loadImportantData();
        networkConnection.addListData();

        System.out.println(networkConnection);
        NetworkConnection networkConnection2=null;
        NetworkConnection networkConnection3=null;
        try {

             networkConnection2 =  (NetworkConnection)networkConnection.clone();
            networkConnection3 =  (NetworkConnection)networkConnection.clone();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        networkConnection.getList().remove(0);

        System.out.println(networkConnection);
        System.out.println(networkConnection2);
        System.out.println(networkConnection3);





    }
}
