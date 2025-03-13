package org.Niccolo.warmup;

import java.util.Scanner;

/*
We have two monkeys, a and b, and two boolean values (aSmile and bSmile) indicate if each is smiling. We are in trouble
if they are both smiling or if neither of them is smiling. Write a program asking the user if monkeys are smiling and
print an alert if we are in trouble (see java.util.Scanner).
 */
public class MonkeyTrouble {
    public static void main(String[] args){
        boolean aSmile, bSmile;
        Scanner sc = new Scanner(System.in);

        System.out.println("Is monkey A smiling? (true or false)");
        aSmile = sc.nextBoolean();
        System.out.println("Is monkey B smiling? (true or false)");
        bSmile = sc.nextBoolean();

        if (aSmile == bSmile){
            System.out.println("We are in big trouble, bro!");
        }
        else {
            System.out.println("Ok, thankfully we're fine...for now");
        }

    }
}
