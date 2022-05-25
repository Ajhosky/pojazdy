package com.company;

import com.company.pojazdy.*;

public class Main {

    public static void main(String[] args) {


        Sedan sedan1 = new Sedan("Sedan", 200, VechicleType.GROUND);
        Bus bus1 = new Bus("Bus", 200, VechicleType.GROUND);
        Tram tram1 = new Tram("Tram", 200, VechicleType.GROUND);
        DeliveryVan deliveryVan1 = new DeliveryVan("deliveryVan1", 200, VechicleType.GROUND);
        FloatPlane floatPlane1 = new FloatPlane("FloatPlane", 1000, VechicleType.FLYING);
        JetFighter jetFighter1 = new JetFighter("JetFighter", 6000, VechicleType.FLYING);
        Buldozer buldozer1 = new Buldozer("Buldozer", 3000, VechicleType.GROUND);
        Motorbike motorbike1 = new Motorbike("MotorBike", 500, VechicleType.GROUND);
        Bicycle bicycle1 = new Bicycle("Bicycle", 700, VechicleType.GROUND);
        Helicopter helicopter1 = new Helicopter("Helicopter", 20000, VechicleType.FLYING);
        CarAmfibia carAmfibia1 = new CarAmfibia("CarAmfibia", 1000, VechicleType.FLOATING);


        //tab1

            Vechicle[] tab1 = new Vechicle[11];
            tab1[0] = sedan1;
            tab1[1] = bus1;
            tab1[2] = tram1;
            tab1[3] = deliveryVan1;
            tab1[4] = floatPlane1;
            tab1[5] = jetFighter1;
            tab1[6] = buldozer1;
            tab1[7] = motorbike1;
            tab1[8] = bicycle1;
            tab1[9] = helicopter1;
            tab1[10] = carAmfibia1;

            for (int i = 0; i < tab1.length; i++) {
                tab1[i].buy();
                tab1[i].sell();
            }


        //tab2

            Vechicle[] tab2 = new Vechicle[10];
            tab2[0] = sedan1;
            tab2[1] = bus1;
            tab2[2] = tram1;
            tab2[3] = deliveryVan1;
            tab2[4] = floatPlane1;
            tab2[5] = jetFighter1;
            tab2[6] = buldozer1;
            tab2[7] = motorbike1;
            tab2[8] = helicopter1;
            tab2[9] = carAmfibia1;

            for (int i = 0; i < tab2.length; i++) {
                tab2[i].
            }



        //tab3

            Vechicle[] tab3 = new Vechicle[7];
            int j = 0;
            for (int i = 0; i < tab1.length; i++){

                if (tab1[i].getType() == VechicleType.GROUND){
                    tab3[j] = tab1[i];
                    j++;
                }

            }
            for (int i = 0; i < tab3.length; i++){

            }

    }
}
