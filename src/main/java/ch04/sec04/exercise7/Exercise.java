package ch04.sec04.exercise7;

public class Exercise {
    public static Object add(Object first, Object second) {
        if (first instanceof Number num1 && second instanceof Number num2) {
            return num1.doubleValue() + num2.doubleValue();
        } else if (first instanceof Boolean bool1 && second instanceof Boolean bool2) {
            return (bool1 || bool2);
        } else if (first instanceof String s1 && second instanceof String s2){
            return s1 + s2;
        } else {
            return null;
        }
    }
}
