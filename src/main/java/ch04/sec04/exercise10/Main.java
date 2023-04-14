package ch04.sec04.exercise10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[5];
        Class<?> arrayClass = array.getClass();
        System.out.println("Array :");
        System.out.println("getName(): " + arrayClass.getName());
        System.out.println("getSimpleName(): " + arrayClass.getSimpleName());
        System.out.println("getCanonicalName(): " + arrayClass.getCanonicalName());
        System.out.println("getTypeName(): " + arrayClass.getTypeName());
        System.out.println("toString(): " + arrayClass.toString());
        System.out.println("toGenericString(): " + arrayClass.toGenericString());
        System.out.println("======================================");
        List<String> list = new ArrayList<>();
        Class<?> listClass = list.getClass();
        System.out.println("List :");
        System.out.println("getName(): " + listClass.getName());
        System.out.println("getSimpleName(): " + listClass.getSimpleName());
        System.out.println("getCanonicalName(): " + listClass.getCanonicalName());
        System.out.println("getTypeName(): " + listClass.getTypeName());
        System.out.println("toString(): " + listClass.toString());
        System.out.println("toGenericString(): " + listClass.toGenericString());
    }
}
