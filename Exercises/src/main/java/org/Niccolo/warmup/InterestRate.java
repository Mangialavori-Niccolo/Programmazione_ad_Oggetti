package org.Niccolo.warmup;

import javax.swing.*;

/*
Write a program that prints the balance of an account after the first, second, and third year.
The account has an initial balance of $1,000 and earns 5 percent interest per year.
 */
public class InterestRate {
    public static void main(String[] args) {
        double balanceInit = 1000;
        double Interest = 0.05;
        double balanceCurr = balanceInit;


        for (int i=0; i<3; i++){
            balanceCurr = balanceCurr + (balanceCurr * Interest);
            System.out.printf("Balance of the %d° year: %f\n", i, balanceCurr);
        }
    }
}
