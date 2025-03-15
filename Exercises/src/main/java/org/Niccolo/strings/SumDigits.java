package org.Niccolo.strings;

/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (see Character class)

Examples:

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
The method has the following prototype:

public static int sumDigits(String string);
where:

string is the string to be processed
 */
public class SumDigits {
    public static int sumDigits(String string){
        if (string == null || string.isEmpty()) return 0;
        int sum = 0;
        for(int i = 0; i < string.length(); i++){
            if (Character.isDigit(string.charAt(i))){
                sum += Integer.parseInt(Character.toString(string.charAt(i)));
            }
        }

        return sum;

        /* Versione prof:
        int sum = 0;
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
         */
    }
}
