package org.Niccolo.generics;

public class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> src){
        return new Pair<V, K>(src.second, src.first);
    }
}
