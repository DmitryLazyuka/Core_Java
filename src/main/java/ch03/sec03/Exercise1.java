package ch03.sec03;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Alice", 100.50),
                new Employee("Bob", 120.60),
                new Employee("Charlie", 205.20),
        };

        double avgSalary = Employee.average(employees);
        System.out.println("Average salary: " + avgSalary);

        System.out.println("The name of employee with the largest salary is " + ((Employee) Employee.largest(employees)).getName());
    }
}
 class Employee implements Measurable {
    private String name;

     public void setName(String name) {
         this.name = name;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     private double salary;

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return this.getSalary();
    }

    public static double average(Measurable[] objects) {
        return Arrays.stream(objects)
                .mapToDouble(Measurable::getMeasure)
                .average().orElse(0);
    }

    public static Measurable largest(Measurable[] objects){
        double tempSalary = Double.MIN_VALUE;
        Measurable result = objects[0];

        for (Measurable obj:objects
             ) {
            if (obj.getMeasure()>tempSalary) {
                tempSalary = obj.getMeasure();
                result = obj;
            }
        }
        return result;
    }
}