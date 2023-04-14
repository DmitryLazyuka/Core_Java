package ch06.sec06.exercise01;

import java.util.ArrayList;

public class Stack<E> {
    private ArrayList<E> elements;
    public Stack() {
        this.elements = new ArrayList<>();
    }    public void push(E e) {
        elements.add(e);
    }

    public E pop() {
        if (isEmpty()) {
          throw new RuntimeException("Stack is empty");
        }
        E temp = elements.get(elements.size() - 1);
        elements.remove(temp);
        return temp;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
