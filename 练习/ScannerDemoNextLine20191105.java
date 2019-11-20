/**
 * This program demonstrates Scanner类来获取用户输入信息-使用nextLine方式
 * @version 1.0 2019.11.05
 * @author chengcai
  */

import java.util.Scanner;

public class ScannerDemoNextLine20191105 {
    /* 主方法 */
    public static void main(String[] args) {
        // 从键盘接受数据
        Scanner scan = new Scanner(System.in);

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");

        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为： " + str2);
        }
        scan.close();
    }
}