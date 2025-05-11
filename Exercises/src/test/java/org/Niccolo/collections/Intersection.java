package org.Niccolo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersection = new HashSet<>(first);
        Iterator<Integer> it = intersection.iterator();
        while(it.hasNext()){
            if(second.contains(Integer.parseInt(it.next().toString()))){
                continue;
            }
            it.remove();
        }

        return intersection;
    }

    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }
}
