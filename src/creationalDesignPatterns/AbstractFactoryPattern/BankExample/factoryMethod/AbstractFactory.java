package creationalDesignPatterns.AbstractFactoryPattern.BankExample.factoryMethod;

import creationalDesignPatterns.AbstractFactoryPattern.BankExample.bank.Bank;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan.Loan;

public interface AbstractFactory {
    public Bank getBank(String bank);

    public Loan getLoan(String loan);
}

