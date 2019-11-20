/**
 * This program demonstrates 可变参数
 * @version 1.0 2019.10.31
 * @author chengcai
  */

/* 构造类 */
class printMax{

    /* 构造方法 */
    printMax (double... numbers){
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (result < numbers[i]){
                result = numbers[i];
            }
        }

        System.out.println("The max value is : " + result);
    }
}

public class VarargsDemo {
    /* 主方法 */
    public static void main(String[] args) {
        // 调用可变参数的方法
        new printMax(2,3,4,5,6,7);

        new printMax(new double[]{1, 2, 3});

        new printMax();
    }
}
