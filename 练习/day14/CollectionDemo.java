import java.util.*;
/*
    1.add方法的参数类型是Object，以便于接受任意类型对象
    2.集合中存储的都是对象的引用（地址）
 */


class CollectionDemo {
    public static void main(String[] args) {
        method_3();
    }

    public static void method_3() {
        //创建一个集合容器，使用Collection接口的子类，ArrayList
        ArrayList al = new ArrayList();

        //1.添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        //获取迭代器，用于取出集合中的元素
        Iterator it = al.iterator();

        while (it.hasNext()) {
            sop(it.next());
        }


        //打印集合
        //sop("原集合："+al);


    }




    public static void method_2() {
        ArrayList al1 = new ArrayList();
        al1.add("java01");
        al1.add("java02");
        //al1.add("java03");
        //al1.add("java04");
        al1.add("java05");
        al1.add("java10");

        ArrayList al2 = new ArrayList();
        al2.add("java01");
        al2.add("java02");
        al2.add("java03");
        al2.add("java04");
        al2.add("java05");
        al2.add("java06");
        al2.add("java07");
        al2.add("java08");
        al2.add("java09");

        //al1.retainAll(al2);//取交集，al1中只会存放和al2中相同的元素
        al1.removeAll(al2);//去除和al2中相同的元素

        sop("a11:"+al1);
        sop("a12:"+al2);
    }

    public static void method_1() {
        //创建一个集合容器，使用Collection接口的子类，ArrayList
        ArrayList al = new ArrayList();

        //1.添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        //打印集合
        sop("原集合："+al);

        //删除集合
        al.remove("java03");
        //清空集合
        //al.clear();

        //2.获取个数，集合长度
        sop("size: "+al.size());

        //打印集合
        sop("删除后集合"+al);

        //判断集合
        sop("java02是否在集合中"+al.contains("java02"));
        sop("集合是否为空"+al.isEmpty());
    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
