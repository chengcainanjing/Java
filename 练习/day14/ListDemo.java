import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        method_1();
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
        al.remove(2);

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

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
