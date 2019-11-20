/**
 * This program demonstrates 文件输入与输出Inputstream、OutputStream
 * @version 1.0 2019.11.04
 * @author chengcai
  */

import java.io.*;

public class fileStreamTest20191104{
    /* 主方法 */
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 12, 13, 24, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);    // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + " ");
            }
            is.close();
        } catch (IOException e){
            System.out.println("Exception");
        }
    }
}
