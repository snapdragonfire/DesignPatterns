package org.example.Creational.AbstractFactoryDesignPattern;

public class FactoryCreator {
    public static AbstractFactory getAbstractFactory(String factoryName){
        if(factoryName.equalsIgnoreCase("bank")){
            return new BankFactory();
        } else if (factoryName.equalsIgnoreCase("loan")) {
            return new LoanFactory();
        } else {
            System.out.println("No such factory present at the moment");
            return null;
        }
    }
}
