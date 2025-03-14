package org.Niccolo.arrays;

/*
Write a method accepting an int and returning the sequence of the digits as an int[].

Examples:

321 → [3, 2, 1]
123 → [1, 2, 3]
The method has the following prototype:

public static int[] splitter(int input);
where:

input is the integer number taken as input.
 */
public class Splitter {
    public static int[] splitter(int input){
        String stringInput = Integer.toString(input);
        int[] splitted = new int[stringInput.length()];

        for(int i = 0; i<stringInput.length(); i++){
            splitted[i] = Character.getNumericValue(stringInput.charAt(i));
        }

        return splitted;
    }
}
