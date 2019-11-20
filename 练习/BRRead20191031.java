/**
 * This program demonstrates 控制台读取字符
 * @version 1.0 2019.10.31
 * @author chengcai
  */

import java.io.*;

public class BRRead20191031{
    /* 主方法 */
    public static void main(String[] args) throws IOException {
        char c;

        // 使用System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'键退出");

        // 读取字符
        do {
            c = (char)br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
