package com.company.pojazdy;

import com.company.pojazdy.other.HasEngine;
import com.company.pojazdy.other.Naziemne;
import com.company.pojazdy.engines.engine;

public class Bus extends Vechicle  implements Naziemne, HasEngine {

    public Bus(String className, Integer price,int sits, VechicleType type) {
        super(className, price, type, sits);
    }
    private engine silnik;

    @Override
    public void ride(Integer distance) {
        System.out.println(getclassName() +" Przejechal "+distance+" metrow");
    }

    @Override
    public void startEngine() {

    }
}
