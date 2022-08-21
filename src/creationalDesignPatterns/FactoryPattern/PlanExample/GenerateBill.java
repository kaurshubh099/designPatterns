package creationalDesignPatterns.FactoryPattern.PlanExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static creationalDesignPatterns.FactoryPattern.PlanExample.factoryMethod.GetPlanFactory.getPlan;

class GenerateBill {
    public static void main(String[] args) throws IOException {

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        var br = new BufferedReader(new InputStreamReader(System.in));

        var planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        var units = Integer.parseInt(br.readLine());

        var p = getPlan(planName);

        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}

