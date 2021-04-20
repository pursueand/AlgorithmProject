package com.pursue.linearsearch;

import androidx.annotation.Nullable;

/**
 * Created by pursue on 4/20/21
 * Describe:
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
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
}
