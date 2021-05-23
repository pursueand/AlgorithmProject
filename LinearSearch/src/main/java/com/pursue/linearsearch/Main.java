package com.pursue.linearsearch;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        int[] data= new int[]{1,2,3,4,5,6,7};
//        int result = LinearSearch.search(data,10);
//        System.out.println(result);

        Integer[] data= new Integer[]{3,1,2,5,8,6,7};
//        System.out.println( LinearSearch.search(data,10));

        String [] strData = new String[]{"java","android","ios"};
//        System.out.println(LinearSearch.search(strData,"java"));

        Student[] students = new Student[]{new Student("ab"),
                new Student("cd"),
                new Student("ef"),
                new Student("gh"),};
        Student stu = new Student("ac");
//        System.out.println(LinearSearch.search(students,stu));
        int[] dataw= new int[]{8,9,2,5,8,6,7};
//        int[] d = QuickSort.MySort(dataw);
//        maopao.MySort(dataw);
//        QuickSort.sort(data);
        maopao.MySort2(dataw);
        for (int i:dataw){
            System.out.println(i);
        }

//        HashMap

        LinkedList


    }
}
