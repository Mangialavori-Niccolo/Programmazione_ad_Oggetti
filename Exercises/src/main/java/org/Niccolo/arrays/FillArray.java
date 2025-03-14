package org.Niccolo.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;
/*
Write a method returning a double[] already filled with values (see java.util.Arrays, java.util.random.RandomGenerator).

Examples:

fillArray(3, 0, false) → [0, 0, 0]
fillArray(5, 1, false) → [1, 1, 1, 1, 1]
fillArray(5, 1, true) → [0.99, 1.02, 1.01, 0.97, 0.95]
fillArray(3, 100, true) → [102.45, 99.33, 96.34]
The method has the following prototype:

public static double[] fillArray(int size, double value, boolean addNoise);
where:

size is the size of the new array.
value is the value to be assigned to all the elements of the new array.
addNoise if true, all the elements have to be randomized between plus or minus 5 percent of value.
 */
public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] dst = new double[size];
        Arrays.fill(dst, value);

        if(addNoise){
            RandomGenerator rnd = RandomGenerator.getDefault();
            for(int i = 0; i < dst.length; i++){
                dst[i] += rnd.nextDouble(-value, value) * 0.05;
            }
        }

        return dst;
    }
}
