import java.util.*;

/*
    ʹ��LinkedListģ��һ����ջ���߶������ݽṹ

    ��ջ���Ƚ��������һ������
    ���У��Ƚ��ȳ�����һ��ˮ��
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
        //return link.removeFirst();//���з�ʽ���Ƚ����
        return link.removeLast();//��ջ��ʽ���Ƚ��ȳ�
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
