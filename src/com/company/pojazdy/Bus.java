package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class Bus extends Vechicle  implements CombustionEngine{

    public Bus(String className, Integer price, VechicleType type) {
        super(className, price, type);
    }

    @Override
    public void startEngine() {

    }
}