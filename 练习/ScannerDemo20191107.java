/**
 * This program demonstrates Scanner类来获取用户输入信息-使用nextLine方式
 * @version 1.0 2019.11.07
 * @author chengcai
  */

import java.util.Scanner;

public class ScannerDemo20191107 {
    /* 主方法 */
    public static void main(String[] args) {
        // 从键盘接受数据
        Scanner scan = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数：");

        // 判断是否输入整数
        if (scan.hasNextInt()) {
            // 接收整数
            i = scan.nextInt();
            System.out.println("输入的整数为： " + i);
        } else {
            //  输出错误信息
            System.out.println("输入的不是整数！");
        }

        System.out.println("输入小数：");

        // 判断是否输入小数
        if (scan.hasNextFloat()) {
            // 接收小数
            f = scan.nextFloat();
            System.out.println("输入的小数为： " + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }
}