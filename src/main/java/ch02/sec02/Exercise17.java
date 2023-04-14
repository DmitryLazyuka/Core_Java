package ch02.sec02;

public class Exercise17 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.print();
        queue.remove();
        queue.print();

        Queue.Iterator iterator =  queue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
