package org.Niccolo.Arrays;

/*
Write a method accepting a double[] and returning a copy of the initial double[] (see System.arraycopy()).

Examples:

copyArray([1, 2, 3]) → [1, 2, 3]
copyArray([2, 1, 1]) → [2, 1, 1]
The method has the following prototype:

public static double[] copyArray(double[] v);
where:

v is the array to be copied.

 */
public class CopyArray {
    public static double[] copyArray(double[] v) {
        double[] ris = new double[v.length];
        System.arraycopy(v, 0, ris, 0, v.length);
        return ris;
    }
}

