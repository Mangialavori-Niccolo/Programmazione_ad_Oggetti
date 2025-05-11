package org.Niccolo.collections;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicatesSlow(List<Integer> list){
        Set<Integer> seen = new HashSet<>();

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(!seen.contains(i)){
                seen.add(i);
            }
            else{
                it.remove();
            }
        }

        return list;
    }

    public static List<Integer> removeDuplicatesFast(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
}
