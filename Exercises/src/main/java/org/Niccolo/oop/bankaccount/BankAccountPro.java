package org.Niccolo.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{
    public static void main(String[] args) {
        BankAccountPro b = new BankAccountPro("I", 0.0);
        System.out.println(b);
    }

    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1, 0.02);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applyFee();
    }

    @Override
    public double withdraw(double amount) {
        double amountSub = super.withdraw(amount);
        applyFee();
        return amountSub;
    }
}
