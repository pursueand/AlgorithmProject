package com.hessian.array_stack_queue.array;

import java.util.Objects;

/**
 * created by xiangy
 * on 2021/4/25
 * 实现动态数组
 */
public class Array<E> {
    private E[] data;
    private int size;//数组中元素的个数，不是容量大小

    /**
     * 根据传入的容量来创建数组
     *
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    /**
     * 获取容量
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 获取数组中的元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 返回数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在index索引的位置插入一个新元素e
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }
        //index位置之后的元素都的外后移动
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 从数组中移除index位置的元素
     * @param index
     * @return 返回移除的元素
     */
    public E remove(int index){
        return (E)new Object();
    }

    /**
     * 数组扩容
     *
     * @param newCapacity 扩容后的大小，扩容规则一般是原有数据的2倍
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
