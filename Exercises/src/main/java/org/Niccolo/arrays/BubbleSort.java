package org.Niccolo.arrays;

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

        while (change) {
            change = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    swap(v, i, i + 1);
                    change = true;
                }
            }
        }
    }

    public static int[] bubbleSortCopy(int[] v) {
        boolean change = true;
        int[] cpy = new int[v.length];
        System.arraycopy(v, 0, cpy, 0, v.length);

        bubbleSort(cpy);

        return  cpy;
    }

    /*
    public static void main(String[] args) {
        int[] v1 = {6, 3, 4, 2};
        BubbleSort.bubbleSort(v1);
        System.out.println(Arrays.toString(v1));

        int[] v2 = {1, 0, 0, 0};
        BubbleSort.bubbleSort(v2);
        System.out.println(Arrays.toString(v2));

        int[] v3 = bubbleSortCopy(new int[]{6, 3, 4, 2});
        System.out.println(Arrays.toString(v3));
        int[] v4 = bubbleSortCopy(new int[]{1, 0, 0, 0});
        System.out.println(Arrays.toString(v4));
    }
    */
}
