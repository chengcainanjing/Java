import java.util.*;

/**
 * This program demonstrates static methods.
 *
 * @author chengcai
 * @version 1.0 2020.01.15
 */

class Employee {
    // 关键字private 确保只有Employee类自身的方法能够访问这些实例域，其他类的方法不能访问这些域
    // 静态域，静态常量
    private static int nextId = 1;

    private String name;
    private double salary;
    private Date hireDay;
    private int id;

    // 构造器与类同名
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
        id = 0;
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

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId; //set id to next available id
        nextId++;
    }

    // 静态方法
    public static int getNextId() {
        return nextId; // returns static field
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    // Employee类中有一个静态的main方法用于单元测试
    public static void main(String[] args) {
        Employee e = new Employee("cc1", 3000, 2020, 01, 15);
        System.out.println(e.getName() + " " + e.getSalary());
    }
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

public class A20200115StaticTest {
    public static void main(String[] args) {
        // construct a Manager object
        Manager boss = new Manager("chengcai", 10000, 2017, 7, 18);
        boss.setBonus(1000);

        // fill the staff array with Manager and Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("cc", 8000, 2018, 6, 11);
        staff[2] = new Employee("zz", 9000, 2013, 4, 8);

        // print out information about all Employee objects
        for (Employee e: staff) {
            e.setId();
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", hireDay=" + e.getHireDay() + ", id=" + e.getId());
        }
    }
}