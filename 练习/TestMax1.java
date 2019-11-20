/**
 * This program demonstrates 方法重载.
 * @version 1.0 2019.10.17
 * @author chengcai
  */



public class TestMax1{
    /* 主方法 */
    public static void main(String[] args){
    double i = 5.4;
    double j = 2.2;
    double k = max(i, j);

    System.out.println(i + " 和 " + j + " 比较，最大值是：" + k);
    }

    /* 返回两个整数变量较大的值 */
    public static int max(int num1, int num2){
        int result = 0;

        if (num1 >= num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    /* 返回两个整数变量较大的值 */
    public static double max(double num1, double num2){
        double result = 0;

        if (num1 >= num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}