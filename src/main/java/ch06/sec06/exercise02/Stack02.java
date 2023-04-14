package ch06.sec06.exercise02;

import java.util.Arrays;

public class Stack02<E> {
    private E[] array;
    private int size;

    public Stack02() {
        array = (E[]) new Object[3];
        size = 0;
    }

    public void push(E e) {
        if (size >= array.length) {
            E[] newArray = Arrays.copyOf(array, array.length * 2);
            array = newArray;
        }
        array[size++] = e;
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[(size--)-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}