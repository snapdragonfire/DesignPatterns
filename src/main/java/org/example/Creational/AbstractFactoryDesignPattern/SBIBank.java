package org.example.Creational.AbstractFactoryDesignPattern;

public class SBIBank implements Bank{
    private static String bankName;


    public void sbi() {
        bankName="SBI";
    }

    @Override
    public String getBankName() {
        sbi();
        return bankName; }
}
