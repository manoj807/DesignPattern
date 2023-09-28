package com.valleytech.designpattern.structure.adaptor.client;

import com.valleytech.designpattern.structure.adaptor.adaptee.WeightMachineForBabies;
import com.valleytech.designpattern.structure.adaptor.adaptor.WeightMachineAdapter;
import com.valleytech.designpattern.structure.adaptor.adaptor.WeightMachineAdaptorImp;

public class MainDemo {

    public static void main(String srt[])
    {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdaptorImp(new WeightMachineForBabies());
        double weightKG= weightMachineAdapter.weightInKg();
        System.out.println("weightKG::"+weightKG);

    }

}
