package org.Niccolo.warmup;

import java.lang.Math;

/*
It is possible to get an estimate of the mathematical constant π by using a random process.
The idea is based on the fact that the area of a circle of radius 1 is equal to π, and the area of a quarter of
that circle is π/4.

<-- 1 -->
 ---------
|x        |
|     x   |
|       x |
|        x|
 ---------


The area of the square is 1, while the area of the part inside the circle is π/4. If we choose a point in the square
at random, the probability that it is inside the circle is π/4. If we choose N points in the square at random
(see Math.random()), and if C of them are inside the circle, we expect the fraction C/N of points that fall inside
the circle to be about π/4.
If N is large enough, we can expect 4 * C/N to be a good estimate for π.

Write a program producing increasingly accurate estimates of PI as reported below (see System.out.printf()):
 */
public class EstimatePI {
    public static void main(String[] args) {
        for(int a = 3; a < 13; a++){
            long C = 0, N = (long)Math.pow(2, a);
            for(long i = 0; i<N; i++)
            {
                double x = Math.random();
                double y = Math.random();

                if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1){
                    C++;
                }
            }

            double pi = 4 * (double)C/N;
            double err = (Math.abs(pi - Math.PI))/Math.PI * 100;
            System.out.printf("[trials=2^%d] [error=%fpc] [estimate=%f]\n", a, err, pi);
        }
    }
}
