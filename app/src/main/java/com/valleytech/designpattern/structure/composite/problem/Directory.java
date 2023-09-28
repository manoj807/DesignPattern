package com.valleytech.designpattern.structure.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String directoryName;
    private List<Object> list;
    public Directory(String directoryName)
    {
      this.directoryName=directoryName;
       this.list= new ArrayList<Object>();

    }

    public void add(Object object)
    {
        list.add(object);
    }





    public void ls()
    {
        System.out.println("Directory Name: " + directoryName);


        for(Object obj:list)
        {
            if(obj instanceof  File)
            {
                ((File)obj).ls();
            }else   if(obj instanceof  Directory)
            {
                ((Directory)obj).ls();
            }
        }


    }





}
