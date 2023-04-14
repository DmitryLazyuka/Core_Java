package ch01.sec01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа от 0 до 4294967295: ");
        String i1 = scanner.nextLine();
        String i2 = scanner.nextLine();

        System.out.println("Сумма = " + Integer.toUnsignedString(Integer.parseUnsignedInt(i1) + Integer.parseUnsignedInt(i2)));
        System.out.println("Разность = " + Integer.toUnsignedString(Integer.parseUnsignedInt(i1) - Integer.parseUnsignedInt(i2)));
        System.out.println("Произведение = " + Integer.toUnsignedString(Integer.parseUnsignedInt(i1) * Integer.parseUnsignedInt(i2)));
        System.out.println("Частное = " + Integer.divideUnsigned(Integer.parseUnsignedInt(i1),Integer.parseUnsignedInt(i2)));
        System.out.println("Остаток = " + Integer.remainderUnsigned(Integer.parseUnsignedInt(i1),Integer.parseUnsignedInt(i2)));
    }
}
