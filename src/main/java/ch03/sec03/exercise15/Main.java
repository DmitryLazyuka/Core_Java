package ch03.sec03.exercise15;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Liam", 12.5),
                new Employee("Henry", 13.5),
                new Employee("Lucas", 213.5),
                new Employee("Benjamin", 122.5),
                new Employee("William", 134.5),
                new Employee("James", 232.5),
                new Employee("Elijah", 322.5),
                new Employee("Oliver", 122.5),
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed());

        for (Employee e : employees
             ) {
            System.out.println(e);
        }
    }
}