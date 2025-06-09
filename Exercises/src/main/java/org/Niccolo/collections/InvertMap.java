package org.Niccolo.collections;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String, Integer> dst = new HashMap<>();

        for(Map.Entry<Integer, String> map : src.entrySet()){
            dst.put(map.getValue(), map.getKey());
        }

        return dst;
    }
}
