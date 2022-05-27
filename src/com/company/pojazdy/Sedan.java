package com.company.pojazdy;

import com.company.pojazdy.other.HasEngine;
import com.company.pojazdy.other.Naziemne;
import com.company.pojazdy.engines.engine;

public class Sedan extends Vechicle  implements  Naziemne, HasEngine {

    private engine silnik;
    public Sedan(String className, Integer price,int sits, VechicleType type) {
       super(className, price, type, sits);
    }

    @Override
    public void ride(Integer distance) {
        System.out.println(getclassName() +" Przejechal "+distance+" metrow");
    }

    @Override
    public void startEngine() {

    }
}
