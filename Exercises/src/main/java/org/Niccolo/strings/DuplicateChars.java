package org.Niccolo.strings;

import java.util.Arrays;

/*
Write a method accepting a string and returning all recurring characters contained into the string as a char[].
More specifically, recurring characters have to be returned in alphabetical order
(see String.valueOf(), String.contains(), String.toCharArray()).
For example: headmistressship -> [e,h,i,s].

Examples:

duplicateChars("whistleblower") → [e, l, w]
duplicateChars("ss") → [s]
duplicateChars("s") → []
duplicateChars("") → []
The method has the following prototype:

public static char[] duplicateChars(String input);
where:

string is the string to be processed
 */
public class DuplicateChars {

    public static boolean isIn(char[] v, char c){
        for(int i = 0; i < v.length; i++){
            if (v[i] == c) return true;
        }
        return false;
    }

    public static char[] duplicateChars(String input){
        if (input.length() <= 1) return new char[]{};
        char[] parRes = new char[input.length()];
        int j = 0;
        for(int i = 0; i < input.length(); i++){
            if(isIn(parRes, input.charAt(i))) continue;
            else if(input.substring(i + 1).contains(input.substring(i, i+1))){
                parRes[j] = input.charAt(i);
                j++;
            }
        }

        char[] res = Arrays.copyOf(parRes, j);
        Arrays.sort(res);
        return  res;
    }
}
