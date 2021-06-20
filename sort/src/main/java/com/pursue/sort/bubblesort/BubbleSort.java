package com.pursue.sort.bubblesort;

/**
 * Created by pursue on 6/20/21
 * Describe:冒泡排序
 */
public class BubbleSort {
    /**
     * 冒泡排序，
     * 1、类似于水中冒泡，大的数沉下去，小的浮上来，就是大的外后排，小的往前排，每一趟变量，都会大最大的移动最后
     * 2、相邻的两个相比，前一个比后一个大的话就交互。。。
     * 3、总共需要n-1趟
     * 4、时间复杂度是O(n*n)
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
