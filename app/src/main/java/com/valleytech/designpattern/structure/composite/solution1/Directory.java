package com.valleytech.designpattern.structure.composite.solution1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem
{

    private String directoryName;
    private List<FileSystem> list;
    public Directory(String directoryName)
    {
      this.directoryName=directoryName;
       this.list= new ArrayList<FileSystem>();

    }


    public void add(FileSystem object)
    {
        list.add(object);
    }




    @Override
    public void ls()
    {
        System.out.println("Directory Name: " + directoryName);


        for(FileSystem obj:list)
        {
            obj.ls();
        }


    }





}
