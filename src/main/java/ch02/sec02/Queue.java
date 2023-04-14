package ch02.sec02;

public class Queue {
    private Node head;
    private Node tail;

    class Node {
        String value;
        Node nextNode;

        Node(String value) {
            this.value = value;
        }
    }

    class Iterator {
        private Node current = head;
        public boolean hasNext() {
            return current != null;
        }

        public String next() {
            String value = current.value;
            if (hasNext()){
                current = current.nextNode;
            }
            return value;
        }
    }

    public void add(String str) {
        Node node = new Node(str);
        if (head == null) {
            head = tail = node;
        } else {
            tail.nextNode = node;
            tail = node;
        }
    }

    public void remove() {
        head = head.nextNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = head;
        if (current.nextNode == null) {
            System.out.println(current.value);

        } else {
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.nextNode;
            }
            System.out.println();
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }
}