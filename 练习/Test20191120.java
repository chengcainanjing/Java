/**
 * This program demonstrates super 和 this 关键字
 * @version 1.0 2019.11.20
 * @author chengcai
  */

class Animal {
    void eat() {
        System.out.println("animal : eat");
    }
}

class Dog extends Animal {
    // 属性
    void eat () {
        System.out.println("dog : eat");
    }

    // 方法
    void eatTest() {
        this.eat();     // this 调用自己的方法
        super.eat();    // super 调用父类的方法
    }
}

public class Test20191120{
    public static void main(String[]args){
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}



