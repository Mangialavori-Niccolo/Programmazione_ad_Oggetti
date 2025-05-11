package org.Niccolo.collections;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> unionBruteForce(Set<Integer> first, Set<Integer> second){
        Set<Integer> union = new HashSet<>(first);
        for(Integer i : second){
            union.add(i);
        }
        return union;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> union = new HashSet<>(first);
        for(Integer i : second) {
            if(!union.contains(i)){
                union.add(i);
            }
        }
        return union;
    }


    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }
}
