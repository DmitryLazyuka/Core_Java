package ch04.sec04.exercise12;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       universalToString(25);
       universalToString("abc");
       universalToString(new ArrayList<String>());
    }
    public static <T> void universalToString(T t){
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if(!field.toString().contains("static")){
                System.out.println(field);
            }
        }
    }
}