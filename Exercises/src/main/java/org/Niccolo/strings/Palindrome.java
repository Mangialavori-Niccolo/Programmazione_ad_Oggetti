package org.Niccolo.strings;



/*
Write a method accepting a string and returning true if the string is a palindrome,
ignoring case considerations (see StringBuilder class).

Examples:

palindrome("whistleblower") → false
palindrome("radar") → true
palindrome("r") → true
palindrome("") → true
palindrome("RaceCar") → true
The method has the following prototype:

public static boolean isPalindrome(String s);
where:

string is the string to be processed
 */
public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.isEmpty()) return true;
        /* Mia versione:
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.compareTo(new StringBuilder(s)) == 0;
         */
        //Prof:
        String sReversed = new StringBuilder(s).reverse().toString();
        return sReversed.equalsIgnoreCase(s);
    }
}
