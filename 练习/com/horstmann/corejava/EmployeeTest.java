package com.horstmann.corejava;
// the classes in this file are part of this package
// 将一个类放入包中，就必须将包的名字放在源文件中的开头
// 该文件中的类被其他文件（A20200120PackageTest）引用

import java.time.*;
// import statements come after the package statement

/**
 * This program demonstrates the use of packages.
 *
 * @author chengcai
 * @version 1.0 2020.01.20
 */

public class Employee {
    private static int nextId;

    private int id;
    // instance field initialization
    // 实例域初始化
    private String name = "";
    private double salary;

    // static initialization block
    // 静态初始化块
    static{
        // 构造器
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    // 对象初始化块
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    // 三个重载构造器
    public Employee(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
    }

    public Employee(double aSalary) {
        // calls the Employee（String,double） constructor
        // 调用this(...)调用另一个构造器
        this("Employee #" + nextId, aSalary);
    }

    // the default constructor
    // 无参数构造器
    public Employee() {
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

    public int getId() {
        return id;
    }
}