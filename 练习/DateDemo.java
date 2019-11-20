import java.util.*;
import java.text.*;

/**
 * This program demonstrates Date.
 * @version 1.0 2019.10.10
 * @author chengcai
  */

public class DateDemo
{
    public static void main(String[] args) {
        // 初始化Data对象
        Date date = new Date();

        // 使用toString()函数显示日期时间
        System.out.println(date.toString());
        System.out.println(date.getTime());

        // 格式化时间
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("当前时间为： " + ft.format(dNow));

        //
    }
}