package com.valleytech.designpattern.adaptor_design_pattern.adaptor;

import com.valleytech.designpattern.adaptor_design_pattern.adaptee.WeightMachine;

public class WeightMachineAdaptorImp implements WeightMachineAdapter
{
    WeightMachine weightMachine=null;
    public WeightMachineAdaptorImp(WeightMachine weightMachine)
    {
        this.weightMachine=weightMachine;
    }
    @Override
    public double weightInKg() {
        return weightMachine.getWeightInPound()*0.45;
    }
}
