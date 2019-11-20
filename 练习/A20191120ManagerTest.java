import java.util.*;

/**
 * This program demonstrates inheritance.
 *
 * @author chengcai
 * @version 1.0 2019.11.20
 */

class Employee {
    public Employee(String n, double s, int year,int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
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

    private String name;
    private double salary;
    private Date hireDay;
}

class Manager extends Employee {
    /**
     * @param n     the employee's name
     * @param s     the salary
     * @param year  the hire year
     * @param month the hire month
     * @param day   the hire day
     */

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    private double bonus;
}

public class A20191120ManagerTest {
    public static void main(String[] args) {
        // construct a Manager object
        Manager boss = new Manager("chengcai", 10000, 2017, 7, 18);
        boss.setBonus(1000);

        Employee[] staff = new Employee[3];

        // fill the staff array with Manager and Employee objects

        staff[0] = boss;
        staff[1] = new Employee("cc", 8000, 2018, 6, 11);
        staff[2] = new Employee("zz", 9000, 2013, 4, 8);

        // print out information about all Employee objects
        for (Employee e: staff) {
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary());
        }
    }
}