import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        method_1();
        method_2();
    }

    public static void method_2() {
        ArrayList al = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");

        sop(al);

        /*
        List集合特有的迭代器。ListIterator是Iterator的子接口

        在迭代中，不可以通过集合对象的方法操作集合中的元素
        因为会发生ConcurentModificationException异常

        所以迭代器时，只能用迭代器的方法操作元素，可是Iterator方法是有限的
        只能对元素进行判断、去除、删除操作
        如果想要其他的操作如添加、修改等，就需要使用其他子接口，ListIterator

        该接口只能通过List集合的listIterator方法获取
         */
        ListIterator li = al.listIterator();

        sop("hasPrevious():"+li.hasPrevious());


        while (li.hasNext()) {
            Object obj = li.next();

            if (obj.equals("java02")) {
                li.add("java002");
            }
        }


        while (li.hasPrevious()) {
            sop("pre:" + li.previous());
        }


        sop("hasPrevious():"+li.hasPrevious());
        sop("hasNext():"+li.hasNext());


        sop(al);
    }



    public static void method_1() {
        ArrayList al = new ArrayList();

        //添加新元素
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");
        al.add("java05");

        sop("原集合是：" + al);

        //在指定位置添加元素
        al.add(1, "java07");

        sop("新集合是：" + al);

        //删除指定位置的元素
        al.remove(4);

        sop("删除后新集合是：" + al);

        //修改元素
        al.set(0, "java0001");

        sop("修改后新元素是：" + al);
        
        //查询元素
        sop("al(1): "+al.get(1));
        
        //遍历元素
        for (Iterator it = al.iterator(); it.hasNext();) {
            sop(it.next());
        }

        //通过indexOf获取对象的位置
        sop("index=" + al.indexOf("java02"));

        List sub = al.subList(1, 3);

        sop("sub=" + sub);
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
