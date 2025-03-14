package org.Niccolo.arrays;

/*
Write a method accepting an int[][] and returning a deep copy of the original. Deep copies differ from shallow
copies in that the whole multidimensional array is duplicated instead of the first tier of pointers only.

The method has the following prototype:

public static int[][] deepCopy(int[][] original);
 */
public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int[][] cpy = new int[original.length][];

        for(int i = 0; i < original.length; i++) {
            cpy[i] = new int[original[i].length];
            System.arraycopy(original[i], 0, cpy[i], 0, original[i].length);
        }

        return  cpy;
    }
}
