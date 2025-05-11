package org.Niccolo.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string){
        if (string == null) return new HashSet<>();

        Set<Character> read = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for(Character c : string.toCharArray()){
            if(!read.contains(c)){
                read.add(c);
            }
            else{
                duplicate.add(c);
            }
        }

        return duplicate;
    }
}
