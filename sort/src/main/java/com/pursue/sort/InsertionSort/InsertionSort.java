package com.pursue.sort.InsertionSort;

/**
 * Created by pursue on 4/24/21
 * Describe: 插入排序算法
 */
public class InsertionSort {
    private InsertionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j = i;j>0;j--){
                if (arr[j].compareTo(arr[j-1]) < 0){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    /**
     * 交换位置
     * @param arr
     * @param j
     * @param i
     */
    private static <E> void swap(E[] arr, int j, int i) {
        E temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    /**
     * 冒泡排序
     */

    private static void bubbleSort(int[] arr){

    }
}
