package ch06.sec06.exercise02;

import java.util.Arrays;

public class Stack03 {
    private Object[] array;
    private int size;

    public Stack03() {
        this.array = new Object[5];
        size = 0;
    }

    public void push(Object o) {
        if (size >= array.length) {
            Object[] newArray = Arrays.copyOf(array, array.length * 2);
            array = newArray;
        }
        array[size++] = o;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[(size--)-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
