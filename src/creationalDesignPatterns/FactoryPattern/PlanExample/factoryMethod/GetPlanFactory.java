package creationalDesignPatterns.FactoryPattern.PlanExample.factoryMethod;

import creationalDesignPatterns.FactoryPattern.PlanExample.plan.DomesticPlan;
import creationalDesignPatterns.FactoryPattern.PlanExample.plan.InstitutionalPlan;
import creationalDesignPatterns.FactoryPattern.PlanExample.plan.Plan;
import creationalDesignPatterns.FactoryPattern.PlanExample.plan.CommercialPlan;

public class GetPlanFactory {

    //use getPlan method to get object of type Plan
    public static Plan getPlan(String planType) {
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