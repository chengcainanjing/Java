import java.util.*;

/**
 * This program demonstrates StringBuffer.
 * @version 1.0 2019.10.10
 * @author chengcai
  */

public class TestStringBuffer
{
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程网站： ");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}