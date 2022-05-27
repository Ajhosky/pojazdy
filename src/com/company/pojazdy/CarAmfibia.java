package com.company.pojazdy;

import com.company.pojazdy.other.HasEngine;
import com.company.pojazdy.other.Naziemne;
import com.company.pojazdy.other.Wodny;

public class CarAmfibia extends Vechicle implements Naziemne, Wodny, HasEngine {

    public CarAmfibia(String className, Integer price,int sits, VechicleType type) {
        super(className, price, type, sits);
    }

    @Override
    public void ride(Integer distance) {
        System.out.println(getclassName() +" Przejechal "+distance+" metrow");
    }

    @Override
    public void swim(Integer distance) {

    }

    @Override
    public void startEngine() {

    }
}
