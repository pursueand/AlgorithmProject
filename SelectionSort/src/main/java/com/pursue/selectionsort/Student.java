package com.pursue.selectionsort;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by pursue on 4/20/21
 * Describe:
 */
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name,int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(@Nullable Object student) {
        if (this == student) {
            return true;
        }
        if (this.getClass() != student.getClass()) {
            return false;
        }
        Student st = (Student) student;
        return this.getName().equals(st.getName());

    }

    @Override
    public int compareTo(Student another) {
//        if (this.score < another.score){
//            return -1;
//        }else if (this.score == another.score){
//            return 0;
//        }else {
//            return 1;
//        }
//        return this.score - another.score;//从小到大排序
        return another.score - this.score;//从大到小排序

    }

    @NonNull
    @Override
    public String toString() {
        return String.format("Student(name:%s,score:%d)",name,score);
    }
}
