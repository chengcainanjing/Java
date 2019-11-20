import java.util.*;

/**
 * This program demonstrates abstract class.
 *
 * @author chengcai
 * @version 1.0 2019.11.20
 */

abstract class Person {
    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();

    private String name;
}


class Employee extends Person {
    public Employee(String n, double s, int year,int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @java.lang.Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    private double salary;
    private Date hireDay;
}

class Teacher extends Person {
    public Teacher(String n, String m) {
        super(n);
        major = m;
    }

    @java.lang.Override
    public String getDescription() {
        return "a teacher teaches " + major;
    }

    private String major;
}

public class A20191120PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("chengcai", 10000, 2017, 7, 18);
        people[1] = new Teacher("jinlei", "Physics");

        for (Person P:people
             ) {
            System.out.println(P.getName() + ", " + P.getDescription());
        }
    }
}