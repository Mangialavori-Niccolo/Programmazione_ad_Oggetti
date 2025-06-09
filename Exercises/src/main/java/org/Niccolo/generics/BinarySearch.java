package org.Niccolo.generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key){
        return search(array, key, 0, array.length - 1);
    }

    public static <T extends  Comparable<T>> int search(T[] array, T key, int first, int last){
        if (last < first) return -1;

        int median = (first + last) / 2;
        int comp = key.compareTo(array[median]);

        if(comp == 0) return median;
        else if(comp < 0) return search(array, key, first, median - 1);
        else return search(array, key, median + 1, last);
    }
}
