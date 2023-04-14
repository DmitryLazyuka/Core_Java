package ch04.sec04;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Test {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        var test = Test.class.getConstructor();
        var myTest = test.newInstance();
        System.out.println(myTest);
        Field[] fields = myTest.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getType().getSimpleName().equals("String")) {
                field.set(myTest, "Name");
            } else if (field.getType().getSimpleName().equals("Integer")) {
                field.set(myTest, 25);
            }
        }
        System.out.println(myTest);
    }
}
