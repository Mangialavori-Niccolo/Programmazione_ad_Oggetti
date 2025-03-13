package org.Niccolo.Arrays;

/*
 Write a method accepting an int and returning a long[] composed of the first n numbers of the Fibonacci series.

Examples:

fibonacci(1) → [0]
fibonacci(2) → [0, 1]
fibonacci(5) → [0, 1, 1, 2, 3]
The method has the following prototype:

public static long[] fibonacci(int n);
where:

n is the number of Fibonacci numbers to be generated.
 */
public class Fibonacci {
    public static long[] fibonacci(int n) {
        long[] out = new long[n];

        for(int i = 0; i<n; i++){
            if(i == 0) out[i] = 0;
            else if(i == 1) out[i] = 1;
            else{
                out[i] = out[i-1] + out[i-2];
            }
        }

        return out;
    }
}
