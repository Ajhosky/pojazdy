package com.company.pojazdy;

import com.company.pojazdy.other.HasEngine;
import com.company.pojazdy.other.Naziemne;

public class DeliveryVan extends Vechicle  implements Naziemne, HasEngine {

    public DeliveryVan(String className, Integer price, int sits, VechicleType type) {
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
