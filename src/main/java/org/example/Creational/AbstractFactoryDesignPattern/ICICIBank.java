package org.example.Creational.AbstractFactoryDesignPattern;

public class ICICIBank implements Bank{
    private String bankName;


    public void icici() {
        bankName="ICICI";
    }

    @Override
    public String getBankName() {

        icici();
        return bankName;
    }
}
