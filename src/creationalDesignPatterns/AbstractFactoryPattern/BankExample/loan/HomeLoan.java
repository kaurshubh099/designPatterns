package creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan;

public class HomeLoan implements Loan{
    @Override
    public void calculateLoanPayment(double loanAmount, int years, double rate) {
        Loan.super.calculateLoanPayment(loanAmount, years, rate);
    }
}
