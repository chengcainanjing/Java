import java.util.*;

/*
    ö�پ���Vector���е�ȡ����ʽ
    ����ö�ٺ͵���������
    ��ʵö�ٺ͵�����һ���ġ�

    ��Ϊö�ٵ������Լ����������ƶ�������
    ���Ա�������ȡ���ˡ�
    ö����������

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
