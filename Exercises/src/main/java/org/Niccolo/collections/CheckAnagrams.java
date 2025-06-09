package org.Niccolo.collections;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second){
        Map<Character, Integer> map1 = stringToMap(first);
        Map<Character, Integer> map2 = stringToMap(second);
        return map1.equals(map2);
    }

    private static Map<Character, Integer> stringToMap (String string){
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : string.toLowerCase().toCharArray()){
            int numOcc = map.getOrDefault(c, 0);
            map.put(c, numOcc + 1);
        }
        return map;
    }
}
