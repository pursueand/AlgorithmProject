package com.pursue.linearsearch;

/**
 * Created by pursue on 5/22/21
 * Describe:
 */
public class maopao {

    public static void MySort(int[] arr) {
        // write code here
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void MySort2(int[] arr) {
        // write code here
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] > arr[i+1]){
//               int temp = arr[i];
//               arr[i] = arr[i+1];
//               arr[i+1] = temp;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }


}
