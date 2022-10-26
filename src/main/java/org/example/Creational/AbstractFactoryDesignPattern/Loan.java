package org.example.Creational.AbstractFactoryDesignPattern;

abstract class Loan {
    protected double interestRate;

    abstract void setInterestRate(double rate);
    public void calculateLoanPayment(double loanamount, int years){
        /*
              to calculate the monthly loan payment i.e. EMI

              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              so, n=years*12;

            */

        double EMI;
        int n;

        n=years*12;
        interestRate=interestRate/1200;
        EMI=((interestRate*Math.pow((1+interestRate),n))/((Math.pow((1+interestRate),n))-1))*loanamount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount of "+loanamount+" you have borrowed");
    }
}
