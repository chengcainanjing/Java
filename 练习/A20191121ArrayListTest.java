import java.util.*;

/**
 * This program demonstrates the ArrayList class.
 * @author chengcai
 * @version 1.0 2019.11.21
 */

// 抽象父类
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

// 抽象类的具体子类
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

    // 重载
    @java.lang.Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    private double salary;
    private Date hireDay;
}

// 抽象类的具体子类
class Teacher extends Person {
    public Teacher(String n, String m) {
        super(n);
        major = m;
    }

    // 重载
    @java.lang.Override
    public String getDescription() {
        return "a teacher teaches " + major;
    }

    private String major;
}

public class A20191121ArrayListTest {
    public static void main(String[] args) {
        // fill the staff array list with three Employee objects
        ArrayList<Person> staff = new ArrayList<>();

        staff.add(new Employee("chengcai", 10000, 2017, 7, 18));
        staff.add(new Teacher("jinlei", "Physics"));

        for (Person P:staff
             ) {
            System.out.println(P.getName() + ", " + P.getDescription());
        }
    }
}