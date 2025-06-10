package org.Niccolo.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        T max = list.getFirst();
        for(T t : list){
            if(cmp.compare(max, t) < 0) max = t;
        }

        return max;
    }

    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T min = list.getFirst();

        for(T t : list){
            if(cmp.compare(min, t) > 0) min = t;
        }

        return min;
    }
}
