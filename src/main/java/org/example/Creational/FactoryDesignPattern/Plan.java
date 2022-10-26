package org.example.Creational.FactoryDesignPattern;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units){
        getRate();
        System.out.println(units*rate);
    }
}


