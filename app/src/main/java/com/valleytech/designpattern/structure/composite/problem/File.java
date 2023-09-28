package com.valleytech.designpattern.structure.composite.problem;

public class File {

    private String fileName;

    public File(String fileName)
    {
        this.fileName=fileName;

    }

    public void ls()
    {
        System.out.println("fileName:::"+fileName);

    }



}
