import java.util.*;

/**
 * This program demonstrates Employee.
 *
 * @author chengcai
 * @version 1.0 2020.01.15
 */

class Employee {
    // 关键字private 确保只有Employee类自身的方法能够访问这些实例域，其他类的方法不能访问这些域
    private String name;
    private double salary;
    private Date hireDay;

    // 构造器与类同名
    public Employee(String n, double s, int year, int month, int day) {
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

public class A20200115EmployeeTest {
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
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}