import com.horstmann.corejava.*;
// the Employee class is defined in that package

import static java.lang.System.*;

/**
 * This program demonstrates the use of packages.
 *
 * @author chengcai
 * @version 1.0 2020.01.20
 */

public class A20200120PackageTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        // because of the import statemetn, we don't hava to use
        // com.horstmann.corejava.Employee here
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("chengcai", 40000);
        staff[1] = new Employee(30000);
        staff[2] = new Employee();

        // print out information about all Employee objects
        for (Employee e : staff) {
            // because of the static import statement, we don't have to use System.out here
            out.println("name= " + e.getName() + ", id= " + e.getId() + ", salary= " + e.getSalary());
        }
    }
}