package creationalDesignPatterns.AbstractFactoryPattern.BankExample.bank;

public class SBI implements Bank{
    @Override
    public String getBankName() {
        return "SBI Bank";
    }
    @Override
    public Double rate() {
        return 8.5;
    }
}
