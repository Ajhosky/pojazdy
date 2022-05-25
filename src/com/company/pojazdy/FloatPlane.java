package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class FloatPlane extends Vechicle implements CombustionEngine {

    public FloatPlane(String className, Integer price, VechicleType type) {
        super(className, price, type);
    }

    @Override
    public void startEngine() {

    }
}
