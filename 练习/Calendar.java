import java.util.*;
import java.text.*;

/**
 * This program demonstrates Calendar.
 * @version 1.0 2019.10.14
 * @author chengcai
  */

public class Calendar
{
    public static void main(String[] args) {
        // 创建一个系统当前日期的calendar对象
        Calendar c = Calendar.getInstance(); //默认当前日期

        // 创建一个代表日期的Calendar对象
        Calendar c1 = Calendar.getInstance();
        // 获取年份
        int year = c1.get(Calendar.YEAR);
        // 获取月份
        int month = c1.get(Calendar.MONTH);
        // 获取日期
        int date = c1.get(Calendar.DATE);
        // 获取小时
        int hour = c1.get(Calendar.HOUR);
        // 获取分钟
        int minute = c1.get(Calendar.MINUTE);
        // 获取秒
        int second = c1.get(Calendar.SECOND);

    }
}