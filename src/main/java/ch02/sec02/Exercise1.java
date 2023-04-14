package ch02.sec02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.lang.System.out;
import static java.time.LocalDate.now;
import static java.time.LocalDate.of;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate date = now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {

            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }

        out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = (weekday.getValue() == 7) ? weekday.getValue() : weekday.getValue() + 1;// 1 = Sunday ... 7 = Saturday
        for (int i = 1; i < value; i++)
            out.print("    ");
        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            out.print("\n\n");
    }
}