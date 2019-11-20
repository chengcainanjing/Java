/**
 * This program demonstrates 捕获异常
 * @version 1.0 2019.11.08
 * @author chengcai
  */

import java.util.Scanner;

public class ExcepTest20191108 {
    /* 主方法 */
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three : " + a[3]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception thrown : " + exception);
        }
        System.out.println("Out of the block");
    }
}