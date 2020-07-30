import java.util.*;

interface Inter<T> {
    void show(T t);
}

/*
//在接口上定义好确定的泛型
class InterImpl implements Inter<String> {
    public void show(String t) {
        System.out.println("show:" + t);

    }
}

 */



//在类上未确定泛型的确切类型
class InterImpl<T> implements Inter<T> {
    public void show(T t) {
        System.out.println("show:" + t);

    }
}




class GenericDemo5 {
    public static void main(String[] args) {
        /*
        //已经确定好泛型类型
        InterImpl i = new InterImpl();
        i.show("haha");

         */

        //不确定泛型类型，需要在建对象时确定
        InterImpl<Integer> i = new InterImpl<Integer>();
        i.show(5);
    }
}