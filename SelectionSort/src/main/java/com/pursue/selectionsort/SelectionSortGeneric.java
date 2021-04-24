package com.pursue.selectionsort;

/**
 * 选择排序 使用泛型
 * Created by pursue on 4/21/21
 * Describe:
 */
public class SelectionSortGeneric {
    private SelectionSortGeneric() {
    }

    /**
     * [0,i)是已经处理的数据，[i,n)是未处理的数据，每次需要在未处理的数据中找到最小值跟数组中i交换位置
     *
     * @param arr
     */
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;//因为需要找到最小的元素和i交换位置，先记录最小值的索引是i；
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex])<0){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    /**
     * 换一种方式实现  [i,n)是已经排好序的，[0,i)是未排好序的
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            int maxIndex = i;//因为需要找到最小的元素和i交换位置，先记录最小值的索引是i；
            for (int j = i; j >= 0; j--) {
                if (arr[j].compareTo(arr[maxIndex])>0){
                    maxIndex = j;
                }
            }
            swap(arr,i,maxIndex);
        }

    }

    private static <E> void swap(E[] arr,int i,int minIndex){
        E temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{7,8,4,5,6,3,10,2};
        SelectionSortGeneric.sort2(arr);
        for (int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();

        Student[] students = {new Student("张三",88),
                              new Student("李四",70),
                              new Student("王五",90)
        };
        SelectionSortGeneric.sort2(students);
        for (Student e:students){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
