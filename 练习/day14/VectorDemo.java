import java.util.*;

/*
    ö�پ���Vector���е�ȡ����ʽ
    ����ö�ٺ͵���������
    ��ʵö�ٺ͵�����һ���ġ�

    ��Ϊö�ٵ������Լ����������ƶ�������
    ���Ա�������ȡ���ˡ�
    ö����������

 */

class VectorDemo {
    public static void main(String[] args) {
        method_1();
    }

    public static void method_1() {
        Vector v = new Vector();

        v.add("java01");
        v.add("java02");
        v.add("java03");

        sop(v);

        Enumeration en = v.elements();


        while (en.hasMoreElements()) {
            sop(en.nextElement());
        }
    }


    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
