package org.Niccolo.Arrays;

/*
Write two methods for ordering an int[]. The only difference between the two methods is that the first one orders
the original int[] directly and returns void, while the second one returns a sorted COPY of the original int[]
(you can use the Bubble Sort algorithm).

Examples:

bubbleSort([6, 3, 4, 2]) → [2, 3, 4, 6]
bubbleSort([9, 8, 7, 4]) → [4, 7, 8, 9]
bubbleSort([1, 0, 0, 0]) → [0, 0, 0, 1]
The method has the following prototype:

public static void bubbleSort(int[] v);
public static int[] bubbleSortCopy(int[] v);
where:

v is the int[] array to be sorted.
 */
public class BubbleSort {
    public static void swap(int[] v, int i, int j){
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }

    public static void bubbleSort(int[] v) {
        boolean change = true;
        int len = v.length;

        while (change) do{
            change = false;
            for (int i = 0; i<len - 1; i++){
                if(v[i] > v[i+1]) {
                    swap(v, i, i+1);
                    change = true;
                    len--;
                }
            }
        }
    }

    public static int[] bubbleSortCopy(int[] v) {

    }
}
