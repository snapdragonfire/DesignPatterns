package org.example.Creational.AbstractFactoryDesignPattern;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        switch (loan.toUpperCase()){
            case "HOME":
                return new HomeLoan();
            case "BUSINESS":
                return new BusinessLoan();
            case "EDUCATION":
                return new EducationLoan();
            default:
                System.out.println("No such loan exists at present");
                return null;
        }
    }
}
