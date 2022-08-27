package creationalDesignPatterns.AbstractFactoryPattern.BankExample.factoryMethod;

import creationalDesignPatterns.AbstractFactoryPattern.BankExample.bank.Bank;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan.BusinessLoan;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan.EducationLoan;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan.HomeLoan;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan.Loan;

class LoanFactory implements AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }

}
