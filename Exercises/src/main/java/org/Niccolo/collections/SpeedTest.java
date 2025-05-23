package org.Niccolo.collections;

import java.util.List;

public class SpeedTest {
    public static long insertBeginning(List<String> list, String item, int times){
        long startTime = System.nanoTime();

        for(int i = 0; i < times; i++){
            list.addFirst(item);
        }

        return System.nanoTime() - startTime;
    }


    public static long insertEnd(List<String> list, String item, int times){
        long startTime = System.nanoTime();

        for(int i = 0; i < times; i++){
            list.addLast(item);
        }

        return System.nanoTime() - startTime;
    }
}
