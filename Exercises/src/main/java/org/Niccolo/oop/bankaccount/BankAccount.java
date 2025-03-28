package org.Niccolo.oop.bankaccount;

public interface BankAccount {

    String getIBAN();

    void setIBAN(String IBAN);

    double getBalance();

    void setBalance(double balance);

    double getOperationFee();

    void setOperationFee(double operationFee);

    double getInterestRate();

    void setInterestRate(double interestRate);

    void deposit(double amount);

    double withdraw(double amount);

    double transfer(BankAccount other, double amount);

    void addInterest();

    void applyFee();

    static void checkIBAN(String IBAN){
        if (IBAN.length() <  8 || IBAN.length() > 34){
            throw new IllegalArgumentException("IBAN troppo lungo o troppo corto!!");
        }
        char[] tmp = IBAN.toCharArray();
        if (!Character.isLetter(tmp[0]) || !Character.isLetter(tmp[1])){
            throw new IllegalArgumentException("Le prime due lettere non sono maiuscole!!");
        }
        if (!Character.isUpperCase(tmp[0]) || !Character.isUpperCase(tmp[1])){
            throw new IllegalArgumentException("Le prime due lettere non sono maiuscole!!");
        }
    }
}
