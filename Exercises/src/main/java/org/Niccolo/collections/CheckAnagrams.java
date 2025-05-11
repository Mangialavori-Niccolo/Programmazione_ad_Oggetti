package org.Niccolo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second){
        Map<Integer, Character> map = new HashMap<>();
        char[] vett = first.toCharArray();
        for(int i = 0; i < vett.length; i++){
            map.put(i, Character.toLowerCase(vett[i]));
        }

        boolean anagrams = true;
        for(char c : second.toCharArray()){
            if(!map.containsValue(Character.toLowerCase(c))){
                anagrams = false;
            }
        }

        return anagrams;
    }
}
