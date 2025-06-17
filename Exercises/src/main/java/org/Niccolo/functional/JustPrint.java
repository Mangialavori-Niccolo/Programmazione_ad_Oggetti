package org.Niccolo.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list){
        list.forEach(person -> System.out.println("Hello " + person + "!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((key, value) -> System.out.println("k:" + key + ", v:" + value));
    }
}
