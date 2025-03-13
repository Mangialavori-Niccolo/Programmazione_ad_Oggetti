package org.Niccolo.warmup;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.lang.Math;

/*
The computer selects a random number between [0, 100] representing the price of an imaginary item.
Two users are asked to guess the right price. The user which proposed the number closer to the right price wins.

Note that Math.abs(n) returns the absolute value of a number (see java.util.random.RandomGenerator, java.util.Scanner).
 */
public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rg = RandomGenerator.getDefault();
        float price = rg.nextFloat(0, 100);
        Scanner sc = new Scanner(System.in);

        System.out.println("User 1: What's the right price?");
        float att1 = sc.nextFloat();
        System.out.println("User 2: What's the right price?");
        float att2 = sc.nextFloat();

        if (Math.abs(price - att1) < Math.abs(price - att2)){
            System.out.printf("Complimenti Utente 1, ci sei andato più vicino. Hai sbagliato solo di %f€", Math.abs(price-att1));
        }
        else if (Math.abs(price - att2) < Math.abs(price - att1)){
            System.out.printf("Complimenti Utente 2, ci sei andato più vicino. Hai sbagliato solo di %f€", Math.abs(price-att2));
        }
        else {
            System.out.printf("Complimenti, ci siete andati vicini uguale. Avete sbagliato solo di %f€", Math.abs(price-att1));
        }
        System.out.printf("Il prezzo era %f€", price);
    }
}
