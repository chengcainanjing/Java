import java.util.*;

/*
    使用LinkedList模拟一个堆栈或者队列数据结构

    堆栈，先进后出，像一个杯子
    队列，先进先出，像一个水管
 */

class DuiLie {
    private LinkedList link;

    DuiLie() {
        link = new LinkedList();
    }

    public void myAdd(Object object) {
        link.addFirst(object);
    }

    public Object myGet() {
        //return link.removeFirst();//队列方式，先进后出
        return link.removeLast();//堆栈方式，先进先出
    }

    public boolean isNull() {
        return link.isEmpty();
    }
}

class LinkedListTest {
    public static void main(String[] args) {
        DuiLie dui1 = new DuiLie();

        dui1.myAdd("java01");
        dui1.myAdd("java02");
        dui1.myAdd("java03");
        dui1.myAdd("java04");

        while (!dui1.isNull()) {
            sop(dui1.myGet());
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
