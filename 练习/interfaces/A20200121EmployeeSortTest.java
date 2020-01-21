//import interfaces.*;

import java.util.*;

/**
 * This program demonstrates the use of the Comparable interface.
 *
 * @author chengcai
 * @version 1.0 2020.01.21
 */

public class A20200121EmployeeSortTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        // 同一个目录下的文件可以直接使用其他文件下的类
        A20200121Employee[] staff = new A20200121Employee[3];

        staff[0] = new A20200121Employee("chengcai", 40000);
        staff[2] = new A20200121Employee("jinlei",30000);
        staff[1] = new A20200121Employee("baibai",20000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (A20200121Employee e : staff) {
            // because of the static import statement, we don't have to use System.out here
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary());
        }
    }
}