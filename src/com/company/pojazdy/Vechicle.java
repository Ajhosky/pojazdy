package com.company.pojazdy;

public abstract  class Vechicle {
    public Integer price;
    public VechicleType type;
    public String className;

    public void sell() {
        System.out.println(this.getclassName() + " selling for " + getPrice());
    }
    public void  buy(){
        System.out.println(this.getclassName() + " buying for " + getPrice());
    }
//    public void startEngine() {
//        System.out.println(this.getclassName() + " is starting the engine");
//    }

    public Vechicle( String className,Integer price ,VechicleType type) {
        this.price = price;
        this.type = type;
        this.className = className;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public VechicleType getType() {
        return type;
    }

    public void setType(VechicleType type) {
        this.type = type;
    }

    public String getclassName() {
        return className;
    }

    public void setclassName(String className) {
        className = className;
    }
}
