package com.pursue.mylibrary.listNode;

/**
 * Created by pursue on 5/22/21
 * Describe:
 */
public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,0,0,0,0};
        int[] B = new int[]{2,5,6};
        mergeArr(A,B,4,3);
    }

    //    题目描述
//    给出两个有序的整数数组 A和 B，请将数组 B合并到数组 A中，变成一个有序的数组
//    注意：
//    可以假设A 数组有足够的空间存放B 数组的元素， A和 B中初始的元素数目分别为m 和n
//
    public static void mergeArr(int[] A, int[] B, int m, int n) {
        int currA = m-1;
        int currB = n-1;
        int index = m+n-1;
        while (currA>=0 && currB >=0){
            if (A[currA]>=B[currB]){
                A[index] = A[currA];
                currA --;
            }else{
                A[index] = B[currB];
                currB --;
            }
            index--;
        }
        while (currB >= 0){
            A[index] = B[currB];
            currB--;
            index --;
        }
        System.out.println(A);
    }

}
