package creationalDesignPatterns.AbstractFactoryPattern.BankExample.loan;

public class EducationLoan implements Loan{
    @Override
    public void calculateLoanPayment(double loanAmount, int years, double rate) {
        Loan.super.calculateLoanPayment(loanAmount, years, rate);
    }
}
