import java.util.*;
/*
//泛型定义在类上
class Demo<T> {
    public void show(T t) {
        System.out.println("show:" + t);
    }

    public<T> void print(T t) {
        System.out.println("print:" + t);
    }
}

 */

//泛型类定义的泛型，在整个类中有效。如果被方法使用
//那么泛型类的对象明确要操作的具体类型后，所有要操作的类型就固定

//为了让不同方法可以操作不同类型，而且类型还不确定，
//那么可以将泛型定义在方法上

/*
//泛型定义在方法上
class Demo {
    public<Q> void show(Q q) {
        System.out.println("show:" + q);
    }

    public<T> void print(T t) {
        System.out.println("print:" + t);
    }
}

 */

//泛型既定义在方法，有定义在类上
//特殊之处，静态方法不可以方位类上定义的泛型
//如果静态方法操作的应用数据类型不确定，可以将泛型定义在方法上
class Demo<T> {
    public void show(T t) {
        System.out.println("show:" + t);
    }

    public<Q> void print(Q q) {
        System.out.println("print:" + q);
    }

    //注意<W>是放在修饰符后面，方法前面
    public static <W> void method(W w) {
        System.out.println("method:" + w);
    }
}


class GenericDemo4 {
    public static void main(String[] args) {
        /*
        //定义泛型类，类中的方法类型不可以改变
        Demo<String> d = new Demo<String>();
        d.show("haha");
        d.print("hehe");
        */

        /*
        //定义方法的类型，不在类上定义类型
        Demo d = new Demo();
        d.show("haha");
        d.show(new Integer(3));
        d.print("hehe");
        d.print(new Integer(4));

         */

        //既定义类上的泛型，又定义方法上的泛型
        Demo<String> d = new Demo<String>();
        d.show("hahah");
        d.print(new Integer(5));
        Demo.method("hehehehe");
        d.method("chengcai");

    }
}