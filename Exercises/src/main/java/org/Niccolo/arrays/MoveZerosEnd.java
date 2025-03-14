package org.Niccolo.arrays;

/*
Write a method accepting an int[] eventually containing zeros and returning an int[] in which all the zeros are at the
end of the array. Maintain the relative order of the other (non-zero) elements.

Examples:

moveZeroEnd([0, 0, 4, 2]) → [4, 2, 0, 0]
moveZeroEnd([9, 0, 0, 4]) → [9, 4, 0, 0]
moveZeroEnd([1, 0, 0, 0]) → [1, 0, 0, 0]
The method has the following prototype:

public static int[] moveZerosEnd(int[] v);
where:

v is the int[] array to be processed.
 */
public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] out = new int[v.length];
        for(int i = 0, j = 0; i<v.length; i++){
            if(v[i] != 0){
                out[j] = v[i];
                j++;
            }
        }

        return out;
    }
}
