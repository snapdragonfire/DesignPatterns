package org.example.Creational.AbstractFactoryDesignPattern;

public class BusinessLoan extends Loan{
    @Override
    void setInterestRate(double rate) {
        interestRate = rate;
    }
}
