//import interfaces.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
// to resolve conflict with java.util.Timer


/**
 * This program demonstrates cloning.
 *
 * @author chengcai
 * @version 1.0 2020.01.21
 */

public class A20200121CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("cc", 50000);
            original.setHireDay(2020, 1, 10);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2010, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
