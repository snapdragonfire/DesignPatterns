package org.example.Creational.FactoryDesignPattern;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if (planType==null) return null;

        switch (planType.toUpperCase()){
            case "DOMESTIC":
                return new DomesticPlan();
            case "COMMERCIAL":
                return new CommercialPlan();
            case "INSTITUTIONAL":
                return new InstitutionalPlan();
            default:
                System.out.println("No such plan type exists at present");
                return null;
        }
    }
}
