package org.Niccolo.Arrays;

/*
 Write a method accepting a double[] and a double value returning a different double[] representing the original
 double[] divided by factor.

Examples:

divideArray([1, 1, 1], 2.0) → [0.5, 0.5, 0.5]
divideArray([2, 1, 1], 1.0) → [2.0, 1.0, 1.0]
divideArray([10, 10], 10.0) → [1.0, 1.0]
The method has the following prototype:

public static double[] divideArray(double[] v, double factor);
where:

v is the double[] array to be processed.
factor is the divisor to be used.

 */
public class DivideArray {
    public static double[] divideArray(double[] v, double factor){
        double[] ris = new double[v.length];
        for(int i = 0; i<v.length; i++){
            ris[i] = v[i] / factor;
        }

        return ris;
    }
}
