package com.company.pojazdy;

import com.company.pojazdy.other.HasEngine;
import com.company.pojazdy.other.Latajacy;

public class JetFighter extends Vechicle implements Latajacy, HasEngine {

    public JetFighter(String className, Integer price,int sits, VechicleType type) {
        super(className, price, type, sits);
    }


    @Override
    public void fly(Integer distance) {
        System.out.println("przelecieal " + distance + " metrow" );
    }

    @Override
    public void laduj(String place) {
        System.out.println(getclassName()+ " Wyladowal w " + place);
    }

    @Override
    public void startEngine() {

    }
}
