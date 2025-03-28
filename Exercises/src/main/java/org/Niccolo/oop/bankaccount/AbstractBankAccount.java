package org.Niccolo.oop.bankaccount;

import lombok.Getter;


@Getter
public abstract class AbstractBankAccount implements BankAccount{
    protected String IBAN;
    protected double balance;
    protected double operationFee;
    protected double interestRate;

    public AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
        this.balance = balance;
        this.operationFee = operationFee;
        this.interestRate = interestRate;
    }

    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void setOperationFee(double operationFee) {
        if(operationFee < 0) throw new IllegalArgumentException("OperationFee lower than 0");
        this.operationFee = operationFee;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit (double amount){
        checkPositiveValue(amount);
        balance += amount;
    }

    @Override
    public double withdraw(double amount){
        checkPositiveValue(amount);
        balance -= amount;
        return amount;
    }

    @Override
    public double transfer(BankAccount other, double amount){
        withdraw(amount);
        other.deposit(amount);

        return amount;
    }

    @Override
    public void addInterest(){
        balance += balance*interestRate;
    }

    @Override
    public void applyFee() {
        balance -= operationFee;
    }

    public void checkPositiveValue(double value){
        if(value < 0.0){
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }
}
