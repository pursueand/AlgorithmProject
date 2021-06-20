package com.pursue.sort;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;

import com.pursue.sort.InsertionSort.InsertionSort;
import com.pursue.sort.bubblesort.BubbleSort;
import com.pursue.sort.quicksort.QuickSort;
import com.pursue.sort.selectionSort.SelectionSort;

/**
 * Created by pursue on 4/24/21
 * Describe:测试类
 */
public class Main {
    public static void main(String[] args) {

//        测试插入排序
        Integer[] arr = new Integer[]{7,8,4,5,6,3,10,2};
        int[] arrInt = new int[]{7,8,4,5,6,3,10,2};
//        InsertionSort.sort(arr);
//        BubbleSort.bubbleSort(arrInt);
        QuickSort.quickSort(arrInt);
        for (int e:arrInt){
            System.out.print(e+" ");
        }
        System.out.println();

    }
}
