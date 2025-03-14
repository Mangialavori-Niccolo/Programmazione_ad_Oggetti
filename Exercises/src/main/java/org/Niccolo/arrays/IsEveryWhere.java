package org.Niccolo.arrays;

/*
 We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
 at least one of the pair is that value. Return true if the given value is everywhere in the array.

Examples:

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
The method has the following prototype:

public static boolean isEveryWhere(int[] v, int value);
where:

v is the int[] array to be processed.
value is the value to be verified (if it is everywhere).
 */
public class IsEveryWhere {
    public static boolean isEveryWhere(int[] v, int value){
        boolean out = true;
        for(int i=0; i<v.length - 1; i++){
            if(v[i] != value && v[i+1] != value) return false;
        }

        return out;
    }
}
