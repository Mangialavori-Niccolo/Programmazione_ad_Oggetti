package org.Niccolo.arrays;

/*
Given two int[] v1 and v2 of the same length, for every element in v1, consider the corresponding element in v2
(at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

Examples:

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
The method has the following prototype:

public static int matchUp(int[] v1, int[] v2);
where:

v1 is the first array
v2 is the second array
 */
public class MatchUp {
    public static int matchUp(int[] v1, int[] v2){
        int cnt = 0;

        for(int i = 0; i < v1.length; i++){
            if (Math.abs(v2[i] - v1[i]) <= 2 && v1[i] != v2[i]) cnt++;
        }

        return cnt;
    }
}
