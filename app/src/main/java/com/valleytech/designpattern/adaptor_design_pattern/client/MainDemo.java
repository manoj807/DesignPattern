package com.valleytech.designpattern.adaptor_design_pattern.client;

import com.valleytech.designpattern.adaptor_design_pattern.adaptee.WeightMachine;
import com.valleytech.designpattern.adaptor_design_pattern.adaptee.WeightMachineForBabies;
import com.valleytech.designpattern.adaptor_design_pattern.adaptor.WeightMachineAdapter;
import com.valleytech.designpattern.adaptor_design_pattern.adaptor.WeightMachineAdaptorImp;

public class MainDemo {

    public static void main(String srt[])
    {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdaptorImp(new WeightMachineForBabies());
        double weightKG= weightMachineAdapter.weightInKg();
        System.out.println("weightKG::"+weightKG);

    }

}
