package org.Niccolo.collections;

import javax.security.auth.login.AccountExpiredException;
import java.util.*;

public class WordFrequencySorted {
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit){
        Map<String, Integer> dst = new HashMap<>();
        List<Map.Entry<String, Integer>> src = new ArrayList<>(map.entrySet());
        src.sort((e1, e2) -> e2.getValue() - e1.getValue());
        src = new ArrayList<>(src.subList(0, limit));

        for(Map.Entry<String, Integer> entry : src){
            dst.put(entry.getKey(), entry.getValue());
        }

        return dst;
    }
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit){
        Map<String, Integer> dst = new HashMap<>();
        List<Map.Entry<String, Integer>> src = new ArrayList<>(map.entrySet());
        src.sort((e1, e2) -> e1.getValue() - e2.getValue());
        src = new ArrayList<>(src.subList(0, limit));

        for(Map.Entry<String, Integer> entry : src){
            dst.put(entry.getKey(), entry.getValue());
        }

        return dst;
    }
}