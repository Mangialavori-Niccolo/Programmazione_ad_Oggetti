package org.Niccolo.arrays;

import java.util.Arrays;
import java.util.Objects;

/*
Given a String[] and a String return true if the String is contained within the String[].
If the String is not present return false. Write two different versions:
(a) uses brute-force search (i.e., which is slow! because tests all elements of the array);
(b) sorts the array and uses binary search (which is much faster!) (see java.util.Arrays)

Both versions should not modify the original array!

Examples:

containsBruteForce(["car", "boat", "bike", "plane"], "bike") → true
containsBruteForce(["car", "boat", "bike", "plane"], "helicopter") → false
containsBinary(["car", "boat", "bike", "plane"], "bike") → true
containsBinary(["car", "boat", "bike", "plane"], "helicopter") → false
The method has the following prototype:

public static boolean containsBruteForce(String[] strings, String searched);
public static boolean containsBinary(String[] strings, String searched);
where:

strings is the array
searched is the string to be searched
 */
public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched){
        for(int i = 0; i < strings.length; i++){
            if(Objects.equals(strings[i], searched)) return true;
        }

        return false;
    }

    public static boolean containsBinary(String[] strings, String searched){
        String[] cpy = Arrays.copyOf(strings, strings.length);
        Arrays.sort(cpy);
        return Arrays.binarySearch(cpy, searched) >= 0;
    }
}
