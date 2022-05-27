package com.company.pojazdy;

import com.company.pojazdy.other.Naziemne;

public class Bicycle extends Vechicle implements Naziemne{

    public Bicycle(String className, Integer price,int sits, VechicleType type) {
        super(className, price, type, sits);
    }

    @Override
    public void ride(Integer distance) {
        System.out.println(getclassName() +" Przejechal "+distance+" metrow");
    }

//    @Override
//    public void sell() {
//
//    }
//
//    @Override
//    public void buy() {
//
//    }
}
