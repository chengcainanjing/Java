
import java.util.regex.*;

/**
 * This program demonstrates 正则表达式-对单词“cat”出现在输入字符串中出现次数进行计数.
 * @version 1.0 2019.10.14
 * @author chengcai
  */

public class RegexMatches1
{
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public static void main(String args[]){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);  // 获取matcher对象
        int count = 0;

        while (m.find()){
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): "+ m.end());
        }
    }
}