package org.Niccolo.generics;

import java.util.List;

public class AppendBounded {
    public static <T, E extends T> void appendBounded(List<T> dst, List<E> src){
        dst.addAll(src);
    }

    //Oppure

    public static <T> void append(List<T> dst, List<? extends T> src){
        dst.addAll(src);
    }
}
