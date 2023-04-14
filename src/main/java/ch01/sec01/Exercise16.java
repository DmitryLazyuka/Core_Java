package ch01.sec01;

public class Exercise16 {
    public static void main(String[] args) {
        String s = """
                \s\spublic class Exercise16 {
                \s\s    public static void main(String[] args) {
                \s\s         String s = \""" + s + \""";
                \s\s    System.out.println(s);
                \s\s    }
                \s\s}""";
        System.out.println(s);
    }
}
