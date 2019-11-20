/**
 * This program demonstrates 方法调用-通过参数传值.
 * @version 1.0 2019.10.16
 * @author chengcai
  */



public class TestPassToValue{
    /* 主方法 */
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 6;
        int[]  myList;

        myList = new int[2];

        System.out.println("交换前: num1 = " + num1
                               + " num2 = " + num2);

        myList = swap(num1, num2);
        num1 = myList[0];
        num2 = myList[1];

        System.out.println("交换后: num1 = " + num1
                + " num2 = " + num2);

    }

    /* 有返回值，通过数组返回 */
    public static int[] swap(int num1,int num2){
        int temp = 0;
        int[]  myList;
        myList = new int[2];

        System.out.println("进入方法");

        System.out.println("交换前：num1 = " + num1
                                + " num2 = " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        myList[0] = num1;
        myList[1] = num2;

        System.out.println("退出方法");
        return myList;
    }
}