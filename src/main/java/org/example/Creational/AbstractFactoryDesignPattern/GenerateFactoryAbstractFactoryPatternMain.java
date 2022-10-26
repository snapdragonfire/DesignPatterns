package org.example.Creational.AbstractFactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateFactoryAbstractFactoryPatternMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanType = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getAbstractFactory("bank");
        AbstractFactory loanFactory = FactoryCreator.getAbstractFactory("loan");

        Bank bank = bankFactory.getBank(bankName);
        Loan loan = loanFactory.getLoan(loanType);

        System.out.print("\n");
        System.out.print("Enter the interest rate for "+bank.getBankName()+ ": ");
        double rate=Double.parseDouble(br.readLine());

        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");
        double amount = Double.parseDouble(br.readLine());

        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(br.readLine());

        loan.setInterestRate(rate);
        loan.calculateLoanPayment(amount, years);
    }
}
