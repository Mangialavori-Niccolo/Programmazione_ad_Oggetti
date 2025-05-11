package org.Niccolo.collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n){
        if(n < 1){
            return new ArrayList<>();
        }

        List<Long> list = new ArrayList<>(List.of(n));
        while(n != 1){
            if (n % 2 == 0){
                n /= 2;
            }
            else{
                n = 3 * n + 1;
            }
            list.add(n);
        }

        return list;
    }
}
