package org.example.Creational.AbstractFactoryDesignPattern;

public class HDFCBank implements Bank{
    private String bankName;


    public void hdfc() {
        bankName="HDFC";
    }

    @Override
    public String getBankName() {

        hdfc();
        return bankName;
    }
}
