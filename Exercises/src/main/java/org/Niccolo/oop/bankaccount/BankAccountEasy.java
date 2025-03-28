package org.Niccolo.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount{
    public BankAccountEasy(String IBAN, double balance){
        super(IBAN, balance, 0, 0);
    }

    @Override
    public double withdraw(double amount){
        double allowedAmount = Math.min(balance, amount);
        return super.withdraw(allowedAmount);
        /*if (balance - amount >= 0) super.withdraw(amount);
        return 0;
         */
    }

    @Override
    public double transfer(BankAccount other, double amount){
        String CountryCodeSrc = IBAN.substring(0, 2);
        String CountryCodeDst = other.getIBAN().substring(0, 2);
        if (!CountryCodeSrc.equals(CountryCodeDst)){
            throw new IllegalArgumentException("Invalid international transfer");
        }
        double allowedAmount = withdraw(amount);
        other.deposit(allowedAmount);
        return allowedAmount;
    }
}
