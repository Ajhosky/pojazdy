package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class JetFighter extends Vechicle implements CombustionEngine{

    public JetFighter(String className, Integer price, VechicleType type) {
        super(className, price, type);
    }

    @Override
    public void startEngine() {

    }
}
