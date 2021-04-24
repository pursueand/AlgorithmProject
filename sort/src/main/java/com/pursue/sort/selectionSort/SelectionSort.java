package com.pursue.sort.selectionSort;

/**
 * 选择排序
 * Created by pursue on 4/21/21
 * Describe:
 */
public class SelectionSort {
    private SelectionSort() {
    }

    /**
     * [0,i)是已经处理的数据，[i,n)是未处理的数据，每次需要在未处理的数据中找到最小值跟数组中i交换位置
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;//因为需要找到最小的元素和i交换位置，先记录最小值的索引是i；
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static void swap(int[] arr,int i,int minIndex){
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,8,4,5,6,3,10,2};
        SelectionSort.sort(arr);
        for (int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
