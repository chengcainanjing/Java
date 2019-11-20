/**
 * This program demonstrates 方法调用-无返回值.
 * @version 1.0 2019.10.16
 * @author chengcai
  */



public class TestVoidMethod{
    /* 主方法 */
    public static void main(String[] args){
        printGrade(26.3);
    }

    /* 无返回值，仅打印评分 */
    public static void printGrade(double score){
        if (score > 90)
            System.out.println("A");
        else if (score > 75)
            System.out.println("B");
        else if (score > 60)
            System.out.println("C");
        else
            System.out.println("D");
    }
}