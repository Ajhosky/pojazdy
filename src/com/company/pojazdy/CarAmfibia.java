package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class CarAmfibia extends Vechicle implements CombustionEngine{

    public CarAmfibia(String className, Integer price, VechicleType type) {
        super(className, price, type);
    }

    @Override
    public void startEngine() {

    }
}
