/**
 * This program demonstrates 构造方法
 * @version 1.0 2019.10.17
 * @author chengcai
  */

/* 构造类 */
class MyClass{
    int x;

    /* 构造方法 */
    MyClass(int i){
        x = i;
    }
}

public class ConsDemo {
    /* 主方法 */
    public static void main(String[] args) {
       MyClass cc1 = new MyClass(2);
       MyClass cc2 = new MyClass(45);

       System.out.println("cc1.x = " + cc1.x);
       System.out.println("cc2.x = " + cc2.x);
    }
}
