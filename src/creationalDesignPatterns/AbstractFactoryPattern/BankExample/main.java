package creationalDesignPatterns.AbstractFactoryPattern.BankExample;

import creationalDesignPatterns.AbstractFactoryPattern.BankExample.bank.Bank;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.factoryMethod.AbstractFactory;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.factoryMethod.FactoryCreator;
import creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan.Loan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName=br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName=br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank(bankName);
        double rate = b.rate();

        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
        l.calculateLoanPayment(loanAmount,years, rate);
    }
}
