import java.util.*;

/*
    枚举就是Vector特有的取出方式
    发现枚举和迭代器很像。
    其实枚举和迭代器一样的。

    因为枚举的名称以及方法的名称都过长。
    所以被迭代器取代了。
    枚举郁郁而终

 */

class LinkedListDemo {
    public static void main(String[] args) {
        method_1();
    }

    public static void method_1() {
        LinkedList link = new LinkedList();

        link.add("java01");
        link.add("java02");
        link.add("java03");
        link.add("java04");
        link.add("java05");

        sop(link);
        //sop(link.getFirst());
        //sop(link.getLast());
        //sop(link.removeFirst());
        //sop(link.removeFirst());
        //sop(link.removeLast());
        //sop("size= "+link.size());

        while (!link.isEmpty()) {
            sop(link.removeLast());
        }


    }


    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
