package org.example.Creational.FactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBillFactoryPatternMain {
    public static void main(String[] args) throws IOException {
        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planType = br.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = getPlanFactory.getPlan(planType);

        System.out.print("Bill amount for "+planType+" plan for  "+units+" units is: ₹");
        p.calculateBill(units);
    }
}
