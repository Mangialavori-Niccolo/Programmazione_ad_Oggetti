package org.Niccolo.generics;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list){
        List<T> tmp = new ArrayList<>(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(tmp.size() - i - 1));
        }
    }
}
