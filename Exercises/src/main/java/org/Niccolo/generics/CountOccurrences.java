package org.Niccolo.generics;

import java.util.Objects;

public class CountOccurrences {
    public static <T> int countOccurrencesPlain(T[] src, T item){
        int count = 0;

        if(item == null){
            for(T t : src){
                if(t == null) count++;
            }
        }
        else{
            for(T t : src){
                if(item.equals(t)) count++;
            }
        }

        return count;
    }
    public static <T> int countOccurrencesObjects(T[] src, T item){
        int count = 0;

        for(T t : src){
            if(Objects.equals(item, t)) count++;
        }

        return count;
    }
}
