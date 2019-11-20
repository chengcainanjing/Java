import java.util.*;
import java.text.*;
import java.util.regex.*;

/**
 * This program demonstrates 正则表达式.
 * @version 1.0 2019.10.14
 * @author chengcai
  */

public class RegexExample
{
    public static void main(String[] args) {
        String content = "I am noob" +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了'runoob' 子字符串？" + isMatch);
    }
}