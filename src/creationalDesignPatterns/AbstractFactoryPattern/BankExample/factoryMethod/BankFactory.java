package creationalDesignPatterns.AbstractFactoryPattern.BankExample.factoryMethod;

import creationalDesignPatterns.AbstractFactoryPattern.BankExample.bank.Bank;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.bank.HDFC;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.bank.SBI;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan.Loan;

class BankFactory implements AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
