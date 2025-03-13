package org.Niccolo.warmup;
import java.util.random.RandomGenerator;
import java.util.Scanner;

/*
Write a program implementing a simple quiz game. The computer selects a random number between 0 and 3 then ask the user
to guess the number.
The game ends when the user correctly guesses the number 0.
(see java.util.random.RandomGenerator, java.util.Scanner).
 */
public class GuessNumber {
    public static void main(String[] args){

        while(true)
        {
            System.out.println("A quale numero sto pensando?");
            int num = RandomGenerator.getDefault().nextInt(0, 3);
            //System.out.println(num);              //Stampa il numero da indovinare

            Scanner scanner = new Scanner(System.in);
            int tentativo = scanner.nextInt();

            if (tentativo == num){
                System.out.println("Complimenti, hai indovinato!");
                if(num == 0) break;
            }
            else {
                System.out.println("Peccato, hai sbagliato. La prossima volta andrà meglio.\n\n");
            }
        }
    }
}
