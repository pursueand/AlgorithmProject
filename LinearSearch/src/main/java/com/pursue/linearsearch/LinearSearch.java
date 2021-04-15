package com.pursue.linearsearch;

/**
 *线性查找，
 */
public class LinearSearch {
    private LinearSearch(){}//私有化构造，禁止外部访问

    /**
     * 线性查找
     * @param data
     * @param targert
     * @return
     */
    public static int search(int[] data,int targert){
        for (int i = 0;i < data.length;i++){
            if (data[i] == targert){
                return i;
            }
        }
        return -1;
    }

}
