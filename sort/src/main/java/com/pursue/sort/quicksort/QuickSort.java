package com.pursue.sort.quicksort;

/**
 * Created by pursue on 6/20/21
 * Describe:快速排序
 */
public class QuickSort {
    /**
     * 快速排序
     * 1、快速排序每一趟会找一个基准元素，可以是第一个，一趟排序结束后基准点左边的都是比它小的，右边的都是比它大的，然后再以相同的方法处理左边的和右边的
     *
     * @param arr
     */
    public static void quickSort(int[] arr){
        sort(arr,0,arr.length-1);
    }
    private static void sort(int[] arr,int l,int r){
        if (l>=r) return;
        int postion = portiton(arr,l,r);
        sort(arr,l,postion-1);
        sort(arr,postion+1,r);
    }
    private static int portiton(int[] arr,int l,int r){
        int j = l;
        for (int i = l;i<=r;i++){
            if (arr[i] < arr[l]){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j,l);
        return j;
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
