package ch06.sec06.exercise01;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
    }
}
