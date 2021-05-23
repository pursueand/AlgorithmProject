package com.pursue.linearsearch;

/**
 * Created by pursue on 5/22/21
 * Describe:
 */
public class QuickSort {

    public static int[] MySort(int[] arr) {
        // write code here
        return sort(arr, 0, arr.length - 1);
    }

    private static int[] sort(int[] data, int left, int right) {

        if (left >= right) return data;
        int position = portition(data, left, right);
        sort(data, left, position - 1);
        sort(data, position + 1, right);

        return data;
    }

    private static int portition(int[] data, int left, int right) {
        int j = left;
        for (int i = left+1; i <= right; i++) {
            if (data[i] < data[left]) {
                j++;
                swap(data, i, j);
            }
        }
        swap(data, j, left);
        return j;
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static <E extends Comparable<E>> void sort(E[] arr){
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r){

        if(l >= r) return;

        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r){

        // arr[l+1...j] < v ; arr[j+1...i] >= v
        int j = l;
        for(int i = l + 1; i <= r; i ++)
            if(arr[i].compareTo(arr[l]) < 0){
                j ++;
                swap(arr, i, j);
            }

        swap(arr, l, j);
        return j;
    }

    private static <E> void swap(E[] arr, int i, int j){

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


}
