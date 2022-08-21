package creationalDesignPatterns.FactoryPattern.factoryMethod;

import creationalDesignPatterns.FactoryPattern.plan.CommercialPlan;
import creationalDesignPatterns.FactoryPattern.plan.DomesticPlan;
import creationalDesignPatterns.FactoryPattern.plan.InstitutionalPlan;
import creationalDesignPatterns.FactoryPattern.plan.Plan;

public class GetPlanFactory {

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("domesticPlan")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("commercialPlan")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("institutionalPlan")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}