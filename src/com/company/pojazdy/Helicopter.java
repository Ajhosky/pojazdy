package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class Helicopter extends Vechicle implements CombustionEngine{

    public Helicopter(String className, Integer price, VechicleType type) {
        super(className, price, type);
    }

    @Override
    public void startEngine() {

    }
}
