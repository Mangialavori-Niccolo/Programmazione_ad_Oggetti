package org.Niccolo.exceptions;

public class Division {
    public static double division(double a, double b){
        if(b == 0) throw new IllegalArgumentException();
        else return a / b;
    }
}
