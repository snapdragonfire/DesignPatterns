package org.example.Creational.AbstractFactoryDesignPattern;

public class HomeLoan extends Loan{
    @Override
    void setInterestRate(double rate) {
        interestRate = rate;
    }
}
