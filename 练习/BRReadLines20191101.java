/**
 * This program demonstrates 控制台读取字符串
 * @version 1.0 2019.11.01
 * @author chengcai
  */

import java.io.*;

public class BRReadLines20191101{
    /* 主方法 */
    public static void main(String[] args) throws IOException {
        String str;

        // 使用System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' of quit.");

        // 读取字符串
        do {
            str = br.readLine();

            System.out.println(str);
        } while (!str.equals("end"));
    }
}
