//import interfaces.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
// to resolve conflict with java.util.Timer


/**
 * This program demonstrates 接口示例.
 * 程序功能：程序有一个时钟，可以请求每秒钟获得一个通告，以便更新时钟的表盘
 * @author chengcai
 * @version 1.0 2020.01.21
 */

public class A20200121TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener
        // once every 10 seconds
        Timer t = new Timer(2000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}