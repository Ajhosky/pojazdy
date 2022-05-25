package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class Buldozer extends Vechicle  implements CombustionEngine{

    public Buldozer(String className, Integer price, VechicleType type) {
        super(className, price, type);
    }

    @Override
    public void startEngine() {

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
