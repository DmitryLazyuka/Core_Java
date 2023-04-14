package ch01.sec01;

public class Exercise9 {
    public static void main(String[] args) {
        String s1 = "STRING";
        String s2 = new String("STRING").intern();
        String s3 = String.join("", "STRI", "NG");
        String s4 = String.valueOf(new char[]{'S', 'T', 'R', 'I', 'N', 'G'});

        System.out.println("s1 equals s2 ? - " + s1.equals(s2) + ", s1 == s2 ? - " + (s1 == s2));
        System.out.println("s1 equals s3 ? - " + s1.equals(s3) + ", s1 == s3 ? - " + (s1 == s3));
        System.out.println("s1 equals s4 ? - " + s1.equals(s4) + ", s1 == s3 ? - " + (s1 == s4));
    }
}