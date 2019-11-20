/**
 * This program demonstrates Scanner类来获取用户输入信息-使用next方式
 * 缺点：仅支持连续输入，不支持空格
 * @version 1.0 2019.11.05
 * @author chengcai
  */

import java.util.Scanner;

public class ScannerDemo20191105 {
    /* 主方法 */
    public static void main(String[] args) {
        // 从键盘接受数据
        Scanner scan = new Scanner(System.in);

        // next方式接收字符串
        System.out.println("next方式接收：");

        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为： " + str1);
        }
        scan.close();
    }
}