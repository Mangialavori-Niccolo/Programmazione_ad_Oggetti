package org.Niccolo.arrays;

/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side
is equal to the sum of the numbers on the other side.

Examples:

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
The method has the following prototype:

public static boolean canBalance(int[] v);
where:

v is the array to be evaluated
 */
public class CanBalance {
    public static boolean canBalance(int[] v){
        int sumSx = 0;
        int sumDx = 0;

        for(int i = 0; i < v.length; i++){
            sumDx += v[i];
        }

        for(int i = 0; i < v.length; i++){
            sumSx += v[i];
            sumDx -= v[i];

            if (sumSx == sumDx) return true;
        }


        return false;
    }
}
