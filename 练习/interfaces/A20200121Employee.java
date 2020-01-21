//package interfaces;

import java.util.*;

/**
 * This program demonstrates the use of the Comparable interface.
 *
 * @author chengcai
 * @version 1.0 2020.01.21
 */

// 该类被同级目录下的其他文件引用，该类需要使用public才能被其他文件引用
// 该类下的方法如果需要被引用，也需要用修饰符public
public class A20200121Employee implements Comparable<A20200121Employee> {
    private String name;
    private double salary;

    public A20200121Employee(String aName, double aSalary) {
        this.name = aName;
        this.salary = aSalary;
    }

    public A20200121Employee(double aSalary) {
        // calls the Employee（String,double） constructor
        // 调用this(...)调用另一个构造器
        this("Employee #", aSalary);
    }

    // the default constructor
    // 无参数构造器
    public A20200121Employee() {
        // name initialized to "" -- see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     *
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject, 0 if the salary are the same, a positive value otherwise
     */
    public int compareTo(A20200121Employee other) {
        return Double.compare(salary, other.salary);
    }
}