package org.Niccolo.collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map){
        for(String v : map.values()){
            if(map.get(v) != null) return true;
        }

        return false;
    }

    public static boolean valuesKeysProf(Map<String, String> map){
        Set<String> intersection = new HashSet<>(map.keySet());
        intersection.retainAll(map.values());

        return !intersection.isEmpty();
    }
}
