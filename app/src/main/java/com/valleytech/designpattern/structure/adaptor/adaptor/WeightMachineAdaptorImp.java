package com.valleytech.designpattern.structure.adaptor.adaptor;

import com.valleytech.designpattern.structure.adaptor.adaptee.WeightMachine;

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
