package com.pursue.linearsearch;

/**
 *线性查找，
 */
public class LinearSearch {
    private LinearSearch(){}//私有化构造，禁止外部访问

//    /**
//     * 线性查找
//     * @param data
//     * @param targert
//     * @return
//     */
//    public static int search(int[] data,int targert){
//        for (int i = 0;i < data.length;i++){
//            if (data[i] == targert){
//                return i;
//            }
//        }
//        return -1;
//    }

    /**
     * 利用泛型，可以兼容各种数据类型
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E> int search(E[] data,E target){
        for (int i= 0;i<data.length;i++){
           if (data[i].equals(target)){
               return i;
           }
        }
        return -1;
    }

}
