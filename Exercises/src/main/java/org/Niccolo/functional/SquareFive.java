package org.Niccolo.functional;

import java.util.List;

public class SquareFive {
    public static long squareFive(List<Integer> nums){
        return nums.stream().map(n -> n*n + 10).filter(n -> n % 10 != 5).count();
    }
}
