package com.valleytech.designpattern.prototype_design_pattern;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable
{


    private String ip;
    private String loadData;

    private List<String> list= new ArrayList<String>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void addListData() {
       list.add("Manoj Kumar");
        list.add("Vinod Kumar");
        list.add("Dayachand Kumar");

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLoadData() {
        return loadData;
    }

    public void setLoadData(String loadData) {
        this.loadData = loadData;
    }

    @NonNull
    @Override
    public String toString() {

        return this.ip+" : "+this.loadData+" : "+this.list;

    }


    public  void loadImportantData() throws InterruptedException
    {
        this.loadData="Load Important Data";
        Thread.sleep(5000);

    }


    //Sallow Copy

   /* @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/


    //Deep Copy
    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {

        NetworkConnection connection=new NetworkConnection();
        connection.setIp(this.ip);
        connection.setLoadData(loadData);
        for(String strs:list)
        {
            connection.getList().add(strs);
        }
        return connection;
    }
}
