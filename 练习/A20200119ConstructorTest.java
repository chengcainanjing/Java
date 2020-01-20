import java.util.*;

/**
 * This program demonstrates object construction.
 *
 * @author chengcai
 * @version 1.0 2020.01.19
 */

public class A20200119ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("chengcai", 40000);
        staff[1] = new Employee(30000);
        staff[2] = new Employee();

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name= " + e.getName() + ", id= " + e.getId() + ", salary= " + e.getSalary());
        }
    }
}

class Employee {
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