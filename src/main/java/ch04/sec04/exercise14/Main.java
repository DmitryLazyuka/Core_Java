package ch04.sec04.exercise14;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<?> systemClass = Class.forName("java.lang.System");
        Field outField = systemClass.getField("out");
        Object out = outField.get(null);
        Method printlnMethod = out.getClass().getMethod("println", String.class);
        printlnMethod.invoke(out, "Hello, World!");
    }
}

