package org.example.Creational.AbstractFactoryDesignPattern;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        switch (bank.toUpperCase()){
            case "SBI":
                return new SBIBank();
            case "HDFC":
                return new HDFCBank();
            case "ICICI":
                return new ICICIBank();
            default:
                System.out.println("No such bank present at the moment");
                return null;
        }
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
