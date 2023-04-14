package ch02.sec02;


public class Exercise9 {
    public static void main(String[] args) {
        TimeOfDay time = new TimeOfDay(23,50);
        TimeOfDay newTime = time.plusMinutes(20);
        System.out.println(newTime);

        TimeOfDay anotherTime = new TimeOfDay(22,59);
        System.out.println(time.minutesFrom(anotherTime));

    }
}
