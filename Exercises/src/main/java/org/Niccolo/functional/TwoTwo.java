package org.Niccolo.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums){
        return nums.stream().map(n -> 2*n).filter(n -> n%10 != 2).collect(Collectors.toList());
    }
}
