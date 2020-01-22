import java.util.Date;
import java.util.GregorianCalendar;

/**
 * This program demonstrates cloning.
 *
 * @author chengcai
 * @version 1.0 2020.01.20
 */

public class Employee implements Cloneable{

    // instance field initialization
    // 实例域初始化
    private String name = "";
    private double salary;
    private Date hireDay;

    // three overloaded constructors
    // 三个重载构造器
    public Employee(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
        hireDay = new Date();
    }

    public Employee(double aSalary) {
        // calls the Employee（String,double） constructor
        // 调用this(...)调用另一个构造器
        this("Employee #", aSalary);
        hireDay = new Date();
    }

    // the default constructor
    // 无参数构造器
    public Employee() {
        // name initialized to "" -- see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        // call Object.clone()
        Employee cloned = (Employee) super.clone();

        // clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    /**
     * Set the hire day to a given date.
     *
     * @param year  the year of the hire day
     * @param month the month of the hire day
     * @param day   the day of the hire day
     */
    public void setHireDay(int year, int month, int day) {
        Date newHierDay = new GregorianCalendar(year, month - 1, day).getTime();

        // Example of instance field mutation
        hireDay.setTime(newHierDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name = " + name + ", salary = " + salary + ", hireDay = " + hireDay + "]";
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}