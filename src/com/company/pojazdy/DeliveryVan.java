package com.company.pojazdy;

import com.company.pojazdy.other.CombustionEngine;

public class DeliveryVan extends Vechicle  implements CombustionEngine{

    public DeliveryVan(String className, Integer price, VechicleType type) {
        super(className, price, type);
    }

    @Override
    public void startEngine() {

    }
}
