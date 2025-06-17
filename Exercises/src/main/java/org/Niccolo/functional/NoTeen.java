package org.Niccolo.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen (List<Integer> nums){
        return nums.stream().filter(v -> v < 13 || v > 19).collect(Collectors.toList());
    }
}
