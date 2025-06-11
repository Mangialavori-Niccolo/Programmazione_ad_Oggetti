package org.Niccolo.exceptions;

public class DivisionSquared {
    public static int divisionSquared(int a, int b){
        try {
            return (int) Math.pow(((double) a /b), 2);
        } catch (ArithmeticException e){
            e.printStackTrace();
            return 0;
        }
    }
}
