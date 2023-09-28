package com.valleytech.designpattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private static Map<String, Pen>  map=new HashMap<String, Pen>();


    public static Pen getMedIumPen(String color)
    {
        String key="Medium-"+color;

        Pen pen=map.get(key);

        if(pen==null)
        {
            Pen localPen=new MediumPen() ;
            localPen.setColor(color);
            map.put(key,localPen);
            return localPen;

        }else
        {
          return pen;

        }

    }


    public static Pen getThinPen(String color)
    {
        String key="Thin-"+color;

        Pen pen=map.get(key);

        if(pen==null)
        {
            Pen localPen=new ThinPen() ;
            localPen.setColor(color);
            map.put(key,localPen);
            return localPen;

        }else
        {
            return pen;

        }

    }


    public static Pen getThickPen(String color)
    {
        String key="Thin-"+color;

        Pen pen=map.get(key);

        if(pen==null)
        {
            Pen localPen=new ThickPen() ;
            localPen.setColor(color);
            map.put(key,localPen);
            return localPen;

        }else
        {
            return pen;

        }

    }

}
