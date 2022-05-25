package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class Sedan extends Vechicle  implements CombustionEngine{

    public Sedan(String className, Integer price, VechicleType type) {
       super(className, price, type);
    }


    @Override
    public void startEngine() {

    }
}
