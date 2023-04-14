package ch02.sec02;

public class Exercise4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        swapPrimitives(a, b);
        System.out.printf("Primitives: a = %d, b = %d", a, b);
        System.out.println();

        IntHolder holder1 = new IntHolder(3);
        IntHolder holder2 = new IntHolder(5);
        swapIntHolders(holder1, holder2);
        System.out.printf("IntHolder: holder1 = %s, holder2 = %s", holder1, holder2);
        System.out.println();


        Integer int1 = 3;
        Integer int2 = 5;
        swapIntegers(int1, int2);
        System.out.printf("Integer: int1 = %d, int2 = %d", int1, int2);
    }



    public static void swapPrimitives(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    private static void swapIntHolders(IntHolder holder1, IntHolder holder2) {
        int temp = holder1.getValue();
        holder1.setValue(holder2.getValue());
        holder2.setValue(temp);
    }

    public static void swapIntegers(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = a;
    }
}

class IntHolder {
    private int value;

    public IntHolder(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
